import unittest
from arithmetics import lcm, lcm_better, lcm_faulty


class TestLCM(unittest.TestCase):

    # ---------- Tests pour lcm ----------
    def test_lcm_branch_p_zero(self):
        self.assertEqual(lcm(40, 50), 200)

    def test_lcm_branch_q_zero(self):
        self.assertEqual(lcm(50, 40), 200)

    def test_lcm_equal(self):
        self.assertEqual(lcm(7, 7), 7)

    def test_lcm_raises_exception(self):
        with self.assertRaises(ValueError):
            lcm(0, 7)
        with self.assertRaises(ValueError):
            lcm(7, 0)
        with self.assertRaises(ValueError):
            lcm(0, 0)

    # ---------- Tests pour lcm_better ----------
    def test_lcm_better_swap(self):
        self.assertEqual(lcm_better(4, 6), 12)

    def test_lcm_better_no_swap(self):
        self.assertEqual(lcm_better(6, 4), 12)

    def test_lcm_better_equal(self):
        self.assertEqual(lcm_better(10, 10), 10)

    def test_lcm_better_raises_exception(self):
        with self.assertRaises(ValueError):
            lcm_better(0, 7)
        with self.assertRaises(ValueError):
            lcm_better(7, 0)
        with self.assertRaises(ValueError):
            lcm_better(0, 0)

    # ---------- Tests pour lcm_faulty ----------
    def test_lcm_faulty_common_case(self):
        lcm_faulty(40, 50)
        lcm_faulty(50, 40)

    def test_lcm_faulty_no_loop(self):
        lcm_faulty(1, 1)

    def test_lcm_faulty_raises_exception(self):
        with self.assertRaises(ValueError):
            lcm_faulty(0, 7)
        with self.assertRaises(ValueError):
            lcm_faulty(7, 0)
        with self.assertRaises(ValueError):
            lcm_faulty(0, 0)


if __name__ == '__main__':
    unittest.main()
