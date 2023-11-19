import com.zjw.utils.StringToDateConverter;
import org.junit.Test;

import java.util.Date;

/**
 * @author 朱俊伟
 * @date 2022/06/12 18:50
 */
public class StringToDateConverterTest {

    /**
     * 测试日期转换
     */
    @Test
    public void testStringToDateConverter(){
        StringToDateConverter converter = new StringToDateConverter();
        Date date = converter.convert("2022-06-12");
        System.out.println(date);
    }
}
