package testing;

import zubergames.voxel.preppercraft.windows.Login;

public class TestClass {

    public static void main(String[] args) {
        new TestClass().go();
    }

    public void go() {
        Login login = new Login("Test", 800, 600);
        login.makeWindow();
    }
}
