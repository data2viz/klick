package io.data2viz

import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformTestsJS {
    @Test
    fun testHello() {
        assertTrue("JS" in hello())
    }
}