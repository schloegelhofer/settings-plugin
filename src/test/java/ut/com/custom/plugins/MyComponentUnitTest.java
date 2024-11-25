package ut.com.custom.plugins;

import org.junit.Test;
import com.custom.plugins.api.MyPluginComponent;
import com.custom.plugins.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}