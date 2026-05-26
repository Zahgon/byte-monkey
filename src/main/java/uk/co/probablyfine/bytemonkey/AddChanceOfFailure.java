package uk.co.probablyfine.bytemonkey;

import java.util.Random;
import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.tree.FrameNode;
import jdk.internal.org.objectweb.asm.tree.InsnList;
import jdk.internal.org.objectweb.asm.tree.JumpInsnNode;
import jdk.internal.org.objectweb.asm.tree.LabelNode;
import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;
import jdk.internal.org.objectweb.asm.tree.MethodInsnNode;

public class AddChanceOfFailure {

    private static final Random random = new Random();

    public InsnList apply(InsnList newInstructions, double chanceOfFailure) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean shouldActivate(double chanceOfFailure) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
