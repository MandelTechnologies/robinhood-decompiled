package com.nimbusds.jose.shaded.ow2asm;

import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes27.dex */
class Frame {
    private int initializationCount;
    private int[] initializations;
    private int[] inputLocals;
    private int[] inputStack;
    private int[] outputLocals;
    private int[] outputStack;
    private short outputStackStart;
    private short outputStackTop;
    Label owner;

    Frame(Label label) {
        this.owner = label;
    }

    final void copyFrom(Frame frame) {
        this.inputLocals = frame.inputLocals;
        this.inputStack = frame.inputStack;
        this.outputStackStart = (short) 0;
        this.outputLocals = frame.outputLocals;
        this.outputStack = frame.outputStack;
        this.outputStackTop = frame.outputStackTop;
        this.initializationCount = frame.initializationCount;
        this.initializations = frame.initializations;
    }

    static int getAbstractTypeFromApiFormat(SymbolTable symbolTable, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return getAbstractTypeFromDescriptor(symbolTable, Type.getObjectType((String) obj).getDescriptor(), 0);
        }
        return symbolTable.addUninitializedType("", ((Label) obj).bytecodeOffset) | 12582912;
    }

    static int getAbstractTypeFromInternalName(SymbolTable symbolTable, String str) {
        return symbolTable.addType(str) | 8388608;
    }

    private static int getAbstractTypeFromDescriptor(SymbolTable symbolTable, String str, int i) {
        char cCharAt = str.charAt(i);
        int iAddType = 4194306;
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return symbolTable.addType(str.substring(i + 1, str.length() - 1)) | 8388608;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 4194308;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'L') {
                                iAddType = symbolTable.addType(str.substring(i2 + 1, str.length() - 1)) | 8388608;
                            } else if (cCharAt2 == 'S') {
                                iAddType = 4194316;
                            } else if (cCharAt2 == 'Z') {
                                iAddType = 4194313;
                            } else if (cCharAt2 == 'I') {
                                iAddType = 4194305;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iAddType = 4194314;
                                        break;
                                    case 'C':
                                        iAddType = 4194315;
                                        break;
                                    case SDK_ASSET_ICON_HOME_VALUE:
                                        iAddType = 4194307;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                iAddType = 4194308;
                            }
                        }
                        return ((i2 - i) << 26) | iAddType;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case SDK_ASSET_ICON_HOME_VALUE:
                            return 4194307;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return 4194305;
    }

    final void setInputFrameFromDescriptor(SymbolTable symbolTable, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.inputLocals = iArr;
        this.inputStack = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = symbolTable.addType(symbolTable.getClassName()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (Type type2 : Type.getArgumentTypes(str)) {
            int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, type2.getDescriptor(), 0);
            int[] iArr2 = this.inputLocals;
            int i4 = i3 + 1;
            iArr2[i3] = abstractTypeFromDescriptor;
            if (abstractTypeFromDescriptor == 4194308 || abstractTypeFromDescriptor == 4194307) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.inputLocals[i3] = 4194304;
            i3++;
        }
    }

    final void setInputFrameFromApiFormat(SymbolTable symbolTable, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.inputLocals[i3] = getAbstractTypeFromApiFormat(symbolTable, objArr[i4]);
            Object obj = objArr[i4];
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                i3 += 2;
                this.inputLocals[i5] = 4194304;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.inputLocals;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 4194304;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            Object obj2 = objArr2[i7];
            if (obj2 == Opcodes.LONG || obj2 == Opcodes.DOUBLE) {
                i6++;
            }
        }
        this.inputStack = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.inputStack[i8] = getAbstractTypeFromApiFormat(symbolTable, objArr2[i9]);
            Object obj3 = objArr2[i9];
            if (obj3 == Opcodes.LONG || obj3 == Opcodes.DOUBLE) {
                i8 += 2;
                this.inputStack[i10] = 4194304;
            } else {
                i8 = i10;
            }
        }
        this.outputStackTop = (short) 0;
        this.initializationCount = 0;
    }

    final int getInputStackSize() {
        return this.inputStack.length;
    }

    private int getLocal(int i) {
        int[] iArr = this.outputLocals;
        if (iArr == null || i >= iArr.length) {
            return i | 16777216;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 16777216 | i;
        iArr[i] = i3;
        return i3;
    }

    private void setLocal(int i, int i2) {
        if (this.outputLocals == null) {
            this.outputLocals = new int[10];
        }
        int length = this.outputLocals.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.outputLocals, 0, iArr, 0, length);
            this.outputLocals = iArr;
        }
        this.outputLocals[i] = i2;
    }

    private void push(int i) {
        if (this.outputStack == null) {
            this.outputStack = new int[10];
        }
        int length = this.outputStack.length;
        short s = this.outputStackTop;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.outputStack, 0, iArr, 0, length);
            this.outputStack = iArr;
        }
        int[] iArr2 = this.outputStack;
        short s2 = this.outputStackTop;
        short s3 = (short) (s2 + 1);
        this.outputStackTop = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.outputStackStart + s3);
        Label label = this.owner;
        if (s4 > label.outputStackMax) {
            label.outputStackMax = s4;
        }
    }

    private void push(SymbolTable symbolTable, String str) {
        int abstractTypeFromDescriptor = getAbstractTypeFromDescriptor(symbolTable, str, str.charAt(0) == '(' ? Type.getReturnTypeOffset(str) : 0);
        if (abstractTypeFromDescriptor != 0) {
            push(abstractTypeFromDescriptor);
            if (abstractTypeFromDescriptor == 4194308 || abstractTypeFromDescriptor == 4194307) {
                push(4194304);
            }
        }
    }

    private int pop() {
        short s = this.outputStackTop;
        if (s > 0) {
            int[] iArr = this.outputStack;
            short s2 = (short) (s - 1);
            this.outputStackTop = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.outputStackStart - 1);
        this.outputStackStart = s3;
        return (-s3) | 20971520;
    }

    private void pop(int i) {
        short s = this.outputStackTop;
        if (s >= i) {
            this.outputStackTop = (short) (s - i);
        } else {
            this.outputStackStart = (short) (this.outputStackStart - (i - s));
            this.outputStackTop = (short) 0;
        }
    }

    private void pop(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            pop((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            pop(2);
        } else {
            pop(1);
        }
    }

    private void addInitializedType(int i) {
        if (this.initializations == null) {
            this.initializations = new int[2];
        }
        int length = this.initializations.length;
        int i2 = this.initializationCount;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.initializations, 0, iArr, 0, length);
            this.initializations = iArr;
        }
        int[] iArr2 = this.initializations;
        int i3 = this.initializationCount;
        this.initializationCount = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[LOOP:0: B:7:0x000d->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getInitializedType(SymbolTable symbolTable, int i) {
        int i2;
        int iAddType;
        if (i == 4194310 || ((-4194304) & i) == 12582912) {
            for (int i3 = 0; i3 < this.initializationCount; i3++) {
                int i4 = this.initializations[i3];
                int i5 = (-67108864) & i4;
                int i6 = 62914560 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 16777216) {
                    i2 = this.inputLocals[i7];
                } else {
                    if (i6 == 20971520) {
                        int[] iArr = this.inputStack;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i != i4) {
                        if (i == 4194310) {
                            iAddType = symbolTable.addType(symbolTable.getClassName());
                        } else {
                            iAddType = symbolTable.addType(symbolTable.getType(i & 1048575).value);
                        }
                        return iAddType | 8388608;
                    }
                }
                i4 = i2 + i5;
                if (i != i4) {
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void execute(int i, int i2, Symbol symbol, SymbolTable symbolTable) {
        switch (i) {
            case 0:
                return;
            case 1:
                push(4194309);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                push(4194305);
                return;
            case 9:
            case 10:
                push(4194308);
                push(4194304);
                return;
            case 11:
            case 12:
            case 13:
                push(4194306);
                return;
            case 14:
            case 15:
                push(4194307);
                push(4194304);
                return;
            case 18:
                int i3 = symbol.tag;
                switch (i3) {
                    case 3:
                        push(4194305);
                        return;
                    case 4:
                        push(4194306);
                        return;
                    case 5:
                        push(4194308);
                        push(4194304);
                        return;
                    case 6:
                        push(4194307);
                        push(4194304);
                        return;
                    case 7:
                        push(symbolTable.addType("java/lang/Class") | 8388608);
                        return;
                    case 8:
                        push(symbolTable.addType("java/lang/String") | 8388608);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                push(symbolTable.addType("java/lang/invoke/MethodHandle") | 8388608);
                                return;
                            case 16:
                                push(symbolTable.addType("java/lang/invoke/MethodType") | 8388608);
                                return;
                            case 17:
                                push(symbolTable, symbol.value);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        break;
                    case 22:
                        break;
                    case 23:
                        break;
                    case 24:
                        break;
                    case 25:
                        push(getLocal(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                pop(2);
                                push(4194305);
                                return;
                            case 47:
                                pop(2);
                                push(4194308);
                                push(4194304);
                                return;
                            case 48:
                                pop(2);
                                push(4194306);
                                return;
                            case 49:
                                pop(2);
                                push(4194307);
                                push(4194304);
                                return;
                            case 50:
                                pop(1);
                                int iPop = pop();
                                if (iPop != 4194309) {
                                    iPop -= 67108864;
                                }
                                push(iPop);
                                return;
                            case 54:
                            case 56:
                            case 58:
                                setLocal(i2, pop());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int local = getLocal(i4);
                                    if (local == 4194308 || local == 4194307) {
                                        setLocal(i4, 4194304);
                                        return;
                                    }
                                    int i5 = local & 62914560;
                                    if (i5 == 16777216 || i5 == 20971520) {
                                        setLocal(i4, local | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 55:
                            case 57:
                                pop(1);
                                setLocal(i2, pop());
                                setLocal(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int local2 = getLocal(i6);
                                    if (local2 == 4194308 || local2 == 4194307) {
                                        setLocal(i6, 4194304);
                                        return;
                                    }
                                    int i7 = local2 & 62914560;
                                    if (i7 == 16777216 || i7 == 20971520) {
                                        setLocal(i6, local2 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        pop(3);
                                        return;
                                    case 80:
                                    case 82:
                                        pop(4);
                                        return;
                                    case 87:
                                    case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                                    case 155:
                                    case 156:
                                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                                    case SDK_ASSET_ICON_EXTERNAL_VALUE:
                                    case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                                        break;
                                    case 88:
                                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                                    case 165:
                                    case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                                        pop(2);
                                        return;
                                    case 89:
                                        int iPop2 = pop();
                                        push(iPop2);
                                        push(iPop2);
                                        return;
                                    case 90:
                                        int iPop3 = pop();
                                        int iPop4 = pop();
                                        push(iPop3);
                                        push(iPop4);
                                        push(iPop3);
                                        return;
                                    case 91:
                                        int iPop5 = pop();
                                        int iPop6 = pop();
                                        int iPop7 = pop();
                                        push(iPop5);
                                        push(iPop7);
                                        push(iPop6);
                                        push(iPop5);
                                        return;
                                    case 92:
                                        int iPop8 = pop();
                                        int iPop9 = pop();
                                        push(iPop9);
                                        push(iPop8);
                                        push(iPop9);
                                        push(iPop8);
                                        return;
                                    case 93:
                                        int iPop10 = pop();
                                        int iPop11 = pop();
                                        int iPop12 = pop();
                                        push(iPop11);
                                        push(iPop10);
                                        push(iPop12);
                                        push(iPop11);
                                        push(iPop10);
                                        return;
                                    case 94:
                                        int iPop13 = pop();
                                        int iPop14 = pop();
                                        int iPop15 = pop();
                                        int iPop16 = pop();
                                        push(iPop14);
                                        push(iPop13);
                                        push(iPop16);
                                        push(iPop15);
                                        push(iPop14);
                                        push(iPop13);
                                        return;
                                    case 95:
                                        int iPop17 = pop();
                                        int iPop18 = pop();
                                        push(iPop17);
                                        push(iPop18);
                                        return;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                                    case 128:
                                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                    case 136:
                                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                                    case 150:
                                        break;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                    case 131:
                                        pop(4);
                                        push(4194308);
                                        push(4194304);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                                    case 144:
                                        break;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        pop(4);
                                        push(4194307);
                                        push(4194304);
                                        return;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                                    case 147:
                                    case 167:
                                    case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                                    case 123:
                                    case 125:
                                        pop(3);
                                        push(4194308);
                                        push(4194304);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                                        setLocal(i2, 4194305);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                                    case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                                        pop(1);
                                        push(4194308);
                                        push(4194304);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                                        pop(1);
                                        push(4194306);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                                        pop(1);
                                        push(4194307);
                                        push(4194304);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                                        break;
                                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                                        pop(1);
                                        push(4194305);
                                        return;
                                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                                        break;
                                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                                    case 151:
                                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                                        pop(4);
                                        push(4194305);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case f2773x8d9721ad:
                                        push(symbolTable, symbol.value);
                                        return;
                                    case f2780x600b66fe:
                                        pop(symbol.value);
                                        return;
                                    case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                                        pop(1);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                                        pop(symbol.value);
                                        pop();
                                        return;
                                    case 182:
                                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                                        pop(symbol.value);
                                        if (i != 184) {
                                            int iPop19 = pop();
                                            if (i == 183 && symbol.name.charAt(0) == '<') {
                                                addInitializedType(iPop19);
                                            }
                                        }
                                        push(symbolTable, symbol.value);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                                        pop(symbol.value);
                                        push(symbolTable, symbol.value);
                                        return;
                                    case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                                        push(symbolTable.addUninitializedType(symbol.value, i2) | 12582912);
                                        return;
                                    case 188:
                                        pop();
                                        switch (i2) {
                                            case 4:
                                                push(71303177);
                                                return;
                                            case 5:
                                                push(71303179);
                                                return;
                                            case 6:
                                                push(71303170);
                                                return;
                                            case 7:
                                                push(71303171);
                                                return;
                                            case 8:
                                                push(71303178);
                                                return;
                                            case 9:
                                                push(71303180);
                                                return;
                                            case 10:
                                                push(71303169);
                                                return;
                                            case 11:
                                                push(71303172);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                                        String str = symbol.value;
                                        pop();
                                        if (str.charAt(0) == '[') {
                                            push(symbolTable, '[' + str);
                                            return;
                                        }
                                        push(symbolTable.addType(str) | 75497472);
                                        return;
                                    case 192:
                                        String str2 = symbol.value;
                                        pop();
                                        if (str2.charAt(0) == '[') {
                                            push(symbolTable, str2);
                                            return;
                                        } else {
                                            push(symbolTable.addType(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                                                pop(i2);
                                                push(symbolTable, symbol.value);
                                                return;
                                            case SDK_ASSET_ICON_ARROW_UP_VALUE:
                                            case SDK_ASSET_ICON_CANCEL_VALUE:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                }
                                pop(1);
                                return;
                        }
                }
        }
    }

    private int getConcreteOutputType(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.inputLocals[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 20971520) {
            return i;
        }
        int i6 = i3 + this.inputStack[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    final boolean merge(SymbolTable symbolTable, Frame frame, int i) {
        boolean zMerge;
        int initializedType;
        int i2;
        int length = this.inputLocals.length;
        int length2 = this.inputStack.length;
        boolean zMerge2 = true;
        if (frame.inputLocals == null) {
            frame.inputLocals = new int[length];
            zMerge = true;
        } else {
            zMerge = false;
        }
        int i3 = 0;
        while (i3 < length) {
            int[] iArr = this.outputLocals;
            if (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                initializedType = this.inputLocals[i3];
            } else {
                initializedType = getConcreteOutputType(i2, length2);
            }
            if (this.initializations != null) {
                initializedType = getInitializedType(symbolTable, initializedType);
            }
            zMerge |= merge(symbolTable, initializedType, frame.inputLocals, i3);
            i3++;
        }
        if (i > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                zMerge |= merge(symbolTable, this.inputLocals[i4], frame.inputLocals, i4);
            }
            if (frame.inputStack == null) {
                frame.inputStack = new int[1];
            } else {
                zMerge2 = zMerge;
            }
            return merge(symbolTable, i, frame.inputStack, 0) | zMerge2;
        }
        int length3 = this.inputStack.length + this.outputStackStart;
        if (frame.inputStack == null) {
            frame.inputStack = new int[this.outputStackTop + length3];
        } else {
            zMerge2 = zMerge;
        }
        for (int i5 = 0; i5 < length3; i5++) {
            int initializedType2 = this.inputStack[i5];
            if (this.initializations != null) {
                initializedType2 = getInitializedType(symbolTable, initializedType2);
            }
            zMerge2 |= merge(symbolTable, initializedType2, frame.inputStack, i5);
        }
        for (int i6 = 0; i6 < this.outputStackTop; i6++) {
            int concreteOutputType = getConcreteOutputType(this.outputStack[i6], length2);
            if (this.initializations != null) {
                concreteOutputType = getInitializedType(symbolTable, concreteOutputType);
            }
            zMerge2 |= merge(symbolTable, concreteOutputType, frame.inputStack, length3 + i6);
        }
        return zMerge2;
    }

    private static boolean merge(SymbolTable symbolTable, int i, int[] iArr, int i2) {
        int iMin;
        int iAddType;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == 4194309) {
            if (i3 == 4194309) {
                return false;
            }
            i = 4194309;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int iAddMergedType = 4194304;
        if (i4 != 0 || (i3 & 62914560) == 8388608) {
            if (i == 4194309) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i5 = i & (-67108864);
                if (i5 != 0 || (i & 62914560) == 8388608) {
                    if (i5 != 0 && (i & 62914560) != 8388608) {
                        i5 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & 62914560) != 8388608) {
                        i4 -= 67108864;
                    }
                    iMin = Math.min(i5, i4) | 8388608;
                    iAddType = symbolTable.addType("java/lang/Object");
                    iAddMergedType = iMin | iAddType;
                }
            } else if ((i3 & 62914560) == 8388608) {
                iAddMergedType = (i & (-67108864)) | 8388608 | symbolTable.addMergedType(i & 1048575, 1048575 & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | 8388608;
                iAddType = symbolTable.addType("java/lang/Object");
                iAddMergedType = iMin | iAddType;
            }
        } else if (i3 == 4194309) {
            if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                i = 4194304;
            }
            iAddMergedType = i;
        }
        if (iAddMergedType == i3) {
            return false;
        }
        iArr[i2] = iAddMergedType;
        return true;
    }

    final void accept(MethodWriter methodWriter) {
        int[] iArr = this.inputLocals;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 4194308 && i6 != 4194307) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 4194304) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.inputStack;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        int iVisitFrameStart = methodWriter.visitFrameStart(this.owner.bytecodeOffset, i3, i8);
        int i10 = 0;
        while (true) {
            int i11 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i12 = iArr[i10];
            i10 += (i12 == 4194308 || i12 == 4194307) ? 2 : 1;
            methodWriter.visitAbstractType(iVisitFrameStart, i12);
            i3 = i11;
            iVisitFrameStart++;
        }
        while (true) {
            int i13 = i8 - 1;
            if (i8 > 0) {
                int i14 = iArr2[i];
                i += (i14 == 4194308 || i14 == 4194307) ? 2 : 1;
                methodWriter.visitAbstractType(iVisitFrameStart, i14);
                iVisitFrameStart++;
                i8 = i13;
            } else {
                methodWriter.visitFrameEnd();
                return;
            }
        }
    }

    static void putAbstractType(SymbolTable symbolTable, int i, ByteVector byteVector) {
        int i2 = ((-67108864) & i) >> 26;
        if (i2 == 0) {
            int i3 = i & 1048575;
            int i4 = i & 62914560;
            if (i4 == 4194304) {
                byteVector.putByte(i3);
                return;
            } else if (i4 == 8388608) {
                byteVector.putByte(7).putShort(symbolTable.addConstantClass(symbolTable.getType(i3).value).index);
                return;
            } else {
                if (i4 == 12582912) {
                    byteVector.putByte(8).putShort((int) symbolTable.getType(i3).data);
                    return;
                }
                throw new AssertionError();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            sb.append('[');
            i2 = i5;
        }
        if ((i & 62914560) == 8388608) {
            sb.append(Matrix.MATRIX_TYPE_RANDOM_LT);
            sb.append(symbolTable.getType(i & 1048575).value);
            sb.append(';');
        } else {
            int i6 = i & 1048575;
            if (i6 == 1) {
                sb.append('I');
            } else if (i6 == 2) {
                sb.append('F');
            } else if (i6 == 3) {
                sb.append('D');
            } else if (i6 != 4) {
                switch (i6) {
                    case 9:
                        sb.append(Matrix.MATRIX_TYPE_ZERO);
                        break;
                    case 10:
                        sb.append('B');
                        break;
                    case 11:
                        sb.append('C');
                        break;
                    case 12:
                        sb.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb.append('J');
            }
        }
        byteVector.putByte(7).putShort(symbolTable.addConstantClass(sb.toString()).index);
    }
}
