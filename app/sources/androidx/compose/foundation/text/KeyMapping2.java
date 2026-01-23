package androidx.compose.foundation.text;

import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: KeyMapping.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m3636d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.KeyMappingKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class KeyMapping2 {
    private static final KeyMapping defaultKeyMapping;

    public static final KeyMapping commonKeyMapping(final Function1<? super KeyEvent, Boolean> function1) {
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo5350mapZmokQxo(android.view.KeyEvent event) {
                if (function1.invoke(KeyEvent.m7106boximpl(event)).booleanValue() && KeyEvent_androidKt.m7122isShiftPressedZmokQxo(event)) {
                    if (Key.m7078equalsimpl0(KeyEvent_androidKt.m7117getKeyZmokQxo(event), MappedKeys.INSTANCE.m5395getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (function1.invoke(KeyEvent.m7106boximpl(event)).booleanValue()) {
                    long jM7117getKeyZmokQxo = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5374getCEK5gGoQ()) ? true : Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5384getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5392getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5393getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5371getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5394getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5395getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m7121isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m7122isShiftPressedZmokQxo(event)) {
                    long jM7117getKeyZmokQxo2 = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5379getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5380getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5381getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5378getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5389getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5388getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5386getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5385getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5384getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM7117getKeyZmokQxo3 = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5379getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5380getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5381getDirectionUpEK5gGoQ())) {
                    return KeyCommand.f60UP;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5378getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5389getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5388getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5386getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5385getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5382getEnterEK5gGoQ()) ? true : Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5387getNumPadEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5373getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5377getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5390getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5376getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5375getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5391getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m7121isCtrlPressedZmokQxo(((KeyEvent) obj).getNativeKeyEvent()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* renamed from: map-ZmokQxo */
            public KeyCommand mo5350mapZmokQxo(android.view.KeyEvent event) {
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m7122isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m7121isCtrlPressedZmokQxo(event)) {
                    long jM7117getKeyZmokQxo = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5379getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5380getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5381getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo, mappedKeys.m5378getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m7121isCtrlPressedZmokQxo(event)) {
                    long jM7117getKeyZmokQxo2 = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5379getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5380getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5381getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5378getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5383getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5377getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5373getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo2, mappedKeys2.m5372getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m7122isShiftPressedZmokQxo(event)) {
                    long jM7117getKeyZmokQxo3 = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5386getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_START;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo3, mappedKeys3.m5385getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_END;
                    }
                } else if (KeyEvent_androidKt.m7120isAltPressedZmokQxo(event)) {
                    long jM7117getKeyZmokQxo4 = KeyEvent_androidKt.m7117getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo4, mappedKeys4.m5373getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m7078equalsimpl0(jM7117getKeyZmokQxo4, mappedKeys4.m5377getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo5350mapZmokQxo(event) : keyCommand;
            }
        };
    }
}
