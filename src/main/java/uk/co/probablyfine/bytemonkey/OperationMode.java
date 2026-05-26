package uk.co.probablyfine.bytemonkey;

import jdk.internal.org.objectweb.asm.Opcodes;
import jdk.internal.org.objectweb.asm.Type;
import jdk.internal.org.objectweb.asm.tree.*;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public enum OperationMode {

    SCIRCUIT {

        public InsnList generateByteCode(TryCatchBlockNode tryCatchBlock, int tcIndex, AgentArguments arguments) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public InsnList generateByteCode(MethodNode method, AgentArguments arguments) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    , LATENCY {

        @Override
        public InsnList generateByteCode(MethodNode method, AgentArguments arguments) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public InsnList generateByteCode(TryCatchBlockNode tryCatchBlock, int tcIndex, AgentArguments arguments) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    , FAULT {

        @Override
        public InsnList generateByteCode(MethodNode method, AgentArguments arguments) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public InsnList generateByteCode(TryCatchBlockNode tryCatchBlock, int tcIndex, AgentArguments arguments) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    , NULLIFY {

        @Override
        public InsnList generateByteCode(MethodNode method, AgentArguments arguments) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public InsnList generateByteCode(TryCatchBlockNode tryCatchBlock, int tcIndex, AgentArguments arguments) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
    ;

    public static OperationMode fromLowerCase(String mode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public abstract InsnList generateByteCode(MethodNode method, AgentArguments arguments);

    public abstract InsnList generateByteCode(TryCatchBlockNode tryCatchBlock, int tcIndex, AgentArguments arguments);
}
