package javatest.com.bjsxt.frameGame;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.IOException;

public class GameUtil
{
    /**
     * 获取图片
     */
    public static Image getImage(String path) throws IOException
    {
        return ImageIO
                  .read(GameUtil.class.getClassLoader().getResource(path));
    }
}






















































