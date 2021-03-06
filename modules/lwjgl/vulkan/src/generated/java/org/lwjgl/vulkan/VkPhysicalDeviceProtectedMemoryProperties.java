/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing protected memory properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceProtectedMemoryProperties} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with a value indicating the implementation-dependent behavior.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_PROTECTED_MEMORY_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code protectedNoFault} &ndash; specifies whether the undefined behavior <b>may</b> include process termination or device loss. If {@code protectedNoFault} is {@link VK10#VK_FALSE FALSE}, undefined behavior <b>may</b> include process termination or device loss. If {@code protectedNoFault} is {@link VK10#VK_TRUE TRUE}, undefined behavior will not include process termination or device loss.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceProtectedMemoryProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 protectedNoFault;
 * }</code></pre>
 */
public class VkPhysicalDeviceProtectedMemoryProperties extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROTECTEDNOFAULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROTECTEDNOFAULT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceProtectedMemoryProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceProtectedMemoryProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code protectedNoFault} field. */
    @NativeType("VkBool32")
    public boolean protectedNoFault() { return nprotectedNoFault(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceProtectedMemoryProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceProtectedMemoryProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceProtectedMemoryProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceProtectedMemoryProperties set(VkPhysicalDeviceProtectedMemoryProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceProtectedMemoryProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceProtectedMemoryProperties create(long address) {
        return wrap(VkPhysicalDeviceProtectedMemoryProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProtectedMemoryProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceProtectedMemoryProperties.class, address);
    }

    /**
     * Create a {@link VkPhysicalDeviceProtectedMemoryProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceProtectedMemoryProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceProtectedMemoryProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProtectedMemoryProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceProtectedMemoryProperties.PNEXT); }
    /** Unsafe version of {@link #protectedNoFault}. */
    public static int nprotectedNoFault(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceProtectedMemoryProperties.PROTECTEDNOFAULT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceProtectedMemoryProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceProtectedMemoryProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceProtectedMemoryProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProtectedMemoryProperties, Buffer> {

        private static final VkPhysicalDeviceProtectedMemoryProperties ELEMENT_FACTORY = VkPhysicalDeviceProtectedMemoryProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceProtectedMemoryProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceProtectedMemoryProperties#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceProtectedMemoryProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceProtectedMemoryProperties.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceProtectedMemoryProperties.npNext(address()); }
        /** Returns the value of the {@code protectedNoFault} field. */
        @NativeType("VkBool32")
        public boolean protectedNoFault() { return VkPhysicalDeviceProtectedMemoryProperties.nprotectedNoFault(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceProtectedMemoryProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceProtectedMemoryProperties.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceProtectedMemoryProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceProtectedMemoryProperties.npNext(address(), value); return this; }

    }

}