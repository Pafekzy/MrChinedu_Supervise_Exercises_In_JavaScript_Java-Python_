import unittest
from SikiroClassTask.Tv import Tv



class testTv(unittest.TestCase):

    def setUp(self):
        self.tv = Tv()

    def test_off_Tv_if_turn_on_is_on(self):
        self.tv.turn_on()
        self.tv.turn_off()
        self.assertFalse(self.tv.is_on)

    def test_on_Tv_if_turn_off_is_off(self):
        self.tv.turn_off()
        self.tv.turn_on()
        self.assertTrue(self.tv.is_on)

    def test_off_Tv_if_turn_off_is_remain_off(self):
        self.tv.turn_off()
        self.assertFalse(self.tv.is_on)

    def test_on_Tv_if_turn_on_remain_on(self):
        self.tv.turn_on()
        self.assertTrue(self.tv.is_on)

    def test_if_Tv_is_on_Tv_can_get_channel(self):
        # Turn on TV, set a channel, and check if it can be retrieved
        self.tv.turn_on()
        self.tv.set_channel(10)
        self.assertEqual(self.tv.get_channel(), 10)

    def test_if_Tv_is_off_Tv_can_not_get_channel(self):
        self.tv.turn_off()
        self.tv.set_channel(5)
        self.assertEqual(self.tv.get_channel(), None)

    def test_if_Tv_is_on_Tv_can_get_channel_from_one_to_100(self):
        self.tv.turn_on()
        for channel in range(1, 101):
            self.tv.set_channel(channel)
            self.assertEqual(self.tv.get_channel(), channel)

    def test_if_Tv_is_on_set_invalid_channel_should_fail(self):
        self.tv.turn_on()
        with self.assertRaises(ValueError):
            self.tv.set_channel(101)

    def test_channel_up_functionality(self):
        self.tv.turn_on()
        self.tv.set_channel(10)
        self.tv.channel_up()
        self.assertEqual(self.tv.get_channel(), 11)

    def test_channel_down_functionality(self):
        self.tv.turn_on()
        self.tv.set_channel(10)
        self.tv.channel_down()
        self.assertEqual(self.tv.get_channel(), 9)

    def test_if_Tv_is_on_Tv_can_set_and_get_volume(self):
        self.tv.turn_on()
        self.tv.set_volume(5)
        self.assertEqual(self.tv.get_volume(), 5)

    def test_if_Tv_is_off_Tv_cannot_set_volume(self):
        self.tv.turn_off()
        self.tv.set_volume(5)
        self.assertEqual(self.tv.get_volume(), None)

    def test_if_Tv_is_on_set_invalid_volume_should_fail(self):
        self.tv.turn_on()
        with self.assertRaises(ValueError):
            self.tv.set_volume(11)

    def test_volume_up_functionality(self):
        self.tv.turn_on()
        self.tv.set_volume(5)
        self.tv.volume_up()
        self.assertEqual(self.tv.get_volume(), 6)

    def test_volume_down_functionality(self):
        self.tv.turn_on()
        self.tv.set_volume(5)
        self.tv.volume_down()
        self.assertEqual(self.tv.get_volume(), 4)

if __name__ == '__main__':
    unittest.main()




class Tv:
    def __init__(self):
        self.channel = 1
        self.volume_level = 1
        self.is_on = False

    def turn_on(self):
        self.is_on = True

    def turn_off(self):
        self.is_on = False
        self.channel = None
        self.volume_level = None

    def get_channel(self):
        return self.channel if self.is_on else None

    def set_channel(self, channel):
        if not self.is_on:
            print("TV is off. Please turn it on before setting a channel.")
            return
        if 1 <= channel  <= 100:
            self.channel = channel
        else:
            raise ValueError("Channel should be between 1 and 100.")

    def get_volume(self):
        return self.volume_level if self.is_on else None

    def set_volume(self, volume_level):
        if not self.is_on:
            print("TV is off. Please turn it on before setting a volume level.")
            return
        if 1 <= volume_level <= 10:
            self.volume_level = volume_level
        else:
            raise ValueError("Volume level should be between 1 and 10.")

    def channel_up(self):
        if self.is_on and self.channel < 100:
            self.channel += 1

    def channel_down(self):
        if self.is_on and self.channel > 1:
            self.channel -= 1

    def volume_up(self):
        if self.is_on and self.volume_level < 10:
            self.volume_level += 1

    def volume_down(self):
        if self.is_on and self.volume_level > 1:
            self.volume_level -= 1
