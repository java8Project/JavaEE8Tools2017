package qin.javaee8.domain;

/**
 * 电脑商品
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
public class ComputerGoods extends SuperGoods
{
    private static final long serialVersionUID = 4604730244150025567L;

    //region 电脑专有的属性

    //region 系统
    /**
     * 系统
     */
    private String computer_os;

    public String getComputer_os()
    {
        return computer_os;
    }

    public void setComputer_os(String computer_os)
    {
        this.computer_os = computer_os;
    }
    //endregion

    //region 分辨率
    /**
     * 分辨率
     */
    private String computer_resolution;

    public String getComputer_resolution()
    {
        return computer_resolution;
    }

    public void setComputer_resolution(String computer_resolution)
    {
        this.computer_resolution = computer_resolution;
    }
    //endregion

    //region 厚度
    /**
     * 厚度
     */
    private String computer_weight;

    public String getComputer_weight()
    {
        return computer_weight;
    }

    public void setComputer_weight(String computer_weight)
    {
        this.computer_weight = computer_weight;
    }

    //endregion

    //region 内存
    /**
     * 内存
     */
    private String computer_memory;

    public String getComputer_memory()
    {
        return computer_memory;
    }

    public void setComputer_memory(String computer_memory)
    {
        this.computer_memory = computer_memory;
    }
    //endregion

    //region 显卡型号
    /**
     * 显卡型号
     */
    private String computer_graphicsModel;

    public String getComputer_graphicsModel()
    {
        return computer_graphicsModel;
    }

    public void setComputer_graphicsModel(String computer_graphicsModel)
    {
        this.computer_graphicsModel = computer_graphicsModel;
    }
    //endregion

    //region 游戏性能
    /**
     * 游戏性能
     */
    private String computer_game;

    public String getComputer_game()
    {
        return computer_game;
    }

    public void setComputer_game(String computer_game)
    {
        this.computer_game = computer_game;
    }
    //endregion

    //region 待机时长
    /**
     * 待机时长
     */
    private String computer_sleepTime;

    public String getComputer_sleepTime()
    {
        return computer_sleepTime;
    }

    public void setComputer_sleepTime(String computer_sleepTime)
    {
        this.computer_sleepTime = computer_sleepTime;
    }
    //endregion

    //region 处理器
    /**
     * 处理器
     */
    private String computer_cpu;

    public String getComputer_cpu()
    {
        return computer_cpu;
    }

    public void setComputer_cpu(String computer_cpu)
    {
        this.computer_cpu = computer_cpu;
    }
    //endregion

    //region 硬盘容量
    /**
     * 硬盘容量
     */
    private String computer_hardDiskMemory;

    public String getComputer_hardDiskMemory()
    {
        return computer_hardDiskMemory;
    }

    public void setComputer_hardDiskMemory(String computer_hardDiskMemory)
    {
        this.computer_hardDiskMemory = computer_hardDiskMemory;
    }
    //endregion

    //region 显存容量
    /**
     * 显存容量
     */
    private String computer_displayMemory;

    public String getComputer_displayMemory()
    {
        return computer_displayMemory;
    }

    public void setComputer_displayMemory(String computer_displayMemory)
    {
        this.computer_displayMemory = computer_displayMemory;
    }
    //endregion

    //region 屏幕尺寸
    /**
     * 屏幕尺寸
     */
    private String computer_screenSize;

    public String getComputer_screenSize()
    {
        return computer_screenSize;
    }

    public void setComputer_screenSize(String computer_screenSize)
    {
        this.computer_screenSize = computer_screenSize;
    }
    //endregion

    //endregion

    //region 对应商品类型
    /**
     * 对应商品类型
     */
    private GoodsType computerGoodsType;

    public GoodsType getComputerGoodsType()
    {
        return computerGoodsType;
    }

    public void setComputerGoodsType(GoodsType computerGoodsType)
    {
        this.computerGoodsType = computerGoodsType;
    }
    //endregion

    //region 构造函数

    @Override
    public Class getLogClass()
    {
        return ComputerGoods.class;
    }

    public ComputerGoods()
    {
        superInfo_logger_normal("正在初始化电脑商品默认构造函数 ");
    }

    public ComputerGoods(String computer_os, String computer_resolution, String computer_weight,
                         String computer_memory, String computer_graphicsModel,
                         String computer_game, String computer_sleepTime,
                         String computer_cpu, String computer_hardDiskMemory,
                         String computer_displayMemory, String computer_screenSize)
    {
        this.computer_os = computer_os;
        this.computer_resolution = computer_resolution;
        this.computer_weight = computer_weight;
        this.computer_memory = computer_memory;
        this.computer_graphicsModel = computer_graphicsModel;
        this.computer_game = computer_game;
        this.computer_sleepTime = computer_sleepTime;
        this.computer_cpu = computer_cpu;
        this.computer_hardDiskMemory = computer_hardDiskMemory;
        this.computer_displayMemory = computer_displayMemory;
        this.computer_screenSize = computer_screenSize;

        superInfo_logger_normal("正在初始化电脑商品有参构造函数" + toString());
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("ComputerGoods{");
        sb.append("computer_os='").append(computer_os).append('\'');
        sb.append(", computer_resolution='").append(computer_resolution).append('\'');
        sb.append(", computer_weight='").append(computer_weight).append('\'');
        sb.append(", computer_memory='").append(computer_memory).append('\'');
        sb.append(", computer_graphicsModel='").append(computer_graphicsModel).append('\'');
        sb.append(", computer_game='").append(computer_game).append('\'');
        sb.append(", computer_sleepTime='").append(computer_sleepTime).append('\'');
        sb.append(", computer_cpu='").append(computer_cpu).append('\'');
        sb.append(", computer_hardDiskMemory='").append(computer_hardDiskMemory).append('\'');
        sb.append(", computer_displayMemory='").append(computer_displayMemory).append('\'');
        sb.append(", computer_screenSize='").append(computer_screenSize).append('\'');
        sb.append('}');
        return sb.toString();
    }
//endregion
}