package com.robinhood.android.supportchat.thread.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.supportchat.C29104R;
import com.robinhood.android.supportchat.thread.CxChatEvent;
import com.robinhood.android.supportchat.thread.CxChatViewState;
import com.robinhood.android.supportchat.thread.compose.CxChatBottomControls;
import com.robinhood.android.supportchat.thread.compose.CxChatBottomControls2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.shared.support.supportchat.p396ui.ChatTextInput;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CxChatBottomControls.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u001c\u001ak\u0010\u001d\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010$\"\u000e\u0010%\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000¨\u0006'²\u0006\n\u0010\u001e\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"CxChatBottomControls", "", "initialInput", "", "chatMode", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "bottomControlStatus", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/supportchat/thread/CxChatEvent;", "onClickSend", "Lkotlin/Function2;", "onCharacterLimitExceeded", "Lkotlin/Function0;", "onInputChanged", "Lkotlin/Function1;", "onClickImageIcon", "modifier", "Landroidx/compose/ui/Modifier;", "inputMaxLength", "", "(Ljava/lang/String;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;Lcom/robinhood/android/udf/event/Event;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "ImagePickerButton", "Landroidx/compose/foundation/layout/RowScope;", "imageButtonStyle", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "onClick", "(Landroidx/compose/foundation/layout/RowScope;Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Input", "input", "placeholder", "sendButtonStyle", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "inputStyle", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)V", "TextInputMaxLines", "TextInputMaxLength", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatBottomControls2 {
    private static final int TextInputMaxLength = 3000;
    private static final int TextInputMaxLines = 6;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatBottomControls$lambda$5(String str, ChatMode chatMode, CxChatViewState.BottomControlState bottomControlState, Event event, Function2 function2, Function0 function0, Function1 function1, Function0 function02, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        CxChatBottomControls(str, chatMode, bottomControlState, event, function2, function0, function1, function02, modifier, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImagePickerButton$lambda$8(Row5 row5, CxChatBottomControls.ImageButton imageButton, Function0 function0, int i, Composer composer, int i2) {
        ImagePickerButton(row5, imageButton, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Input$lambda$13(Row5 row5, String str, String str2, Function1 function1, CxChatBottomControls.SendButton sendButton, CxChatBottomControls.Input input, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        Input(row5, str, str2, function1, sendButton, input, function0, function02, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CxChatBottomControls(final String initialInput, final ChatMode chatMode, final CxChatViewState.BottomControlState bottomControlStatus, final Event<CxChatEvent> event, final Function2<? super ChatMode, ? super String, Unit> onClickSend, final Function0<Unit> onCharacterLimitExceeded, final Function1<? super String, Unit> onInputChanged, final Function0<Unit> onClickImageIcon, Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        Composer composer2;
        final int i6;
        EventConsumer<CxChatEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(initialInput, "initialInput");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(bottomControlStatus, "bottomControlStatus");
        Intrinsics.checkNotNullParameter(onClickSend, "onClickSend");
        Intrinsics.checkNotNullParameter(onCharacterLimitExceeded, "onCharacterLimitExceeded");
        Intrinsics.checkNotNullParameter(onInputChanged, "onInputChanged");
        Intrinsics.checkNotNullParameter(onClickImageIcon, "onClickImageIcon");
        Composer composerStartRestartGroup = composer.startRestartGroup(927566103);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(initialInput) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(chatMode) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? composerStartRestartGroup.changed(bottomControlStatus) : composerStartRestartGroup.changedInstance(bottomControlStatus) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(event) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onClickSend) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCharacterLimitExceeded) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onInputChanged) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onClickImageIcon) ? 8388608 : 4194304;
        }
        int i7 = i3 & 256;
        if (i7 == 0) {
            if ((100663296 & i2) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i4 |= 805306368;
            } else if ((i2 & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
            }
            if ((i4 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                int i8 = i5 == 0 ? 3000 : i;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(927566103, i4, -1, "com.robinhood.android.supportchat.thread.compose.CxChatBottomControls (CxChatBottomControls.kt:41)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i4 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CxChatBottomControls2.CxChatBottomControls$lambda$1$lambda$0(initialInput);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                Modifier modifier4 = modifier3;
                int i9 = i8;
                composer2 = composerStartRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(!Intrinsics.areEqual(bottomControlStatus, CxChatViewState.BottomControlState.Hidden.INSTANCE), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-2142541329, true, new C291821(modifier4, bottomControlStatus, onClickImageIcon, snapshotState, onInputChanged, onClickSend, chatMode, onCharacterLimitExceeded, i8), composerStartRestartGroup, 54), composer2, 196608, 30);
                if (event != null && (event.getData() instanceof CxChatEvent.ClearInput) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$CxChatBottomControls$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19160invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19160invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CxChatBottomControls2.CxChatBottomControls$lambda$3(snapshotState, "");
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
                i6 = i9;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i6 = i;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CxChatBottomControls2.CxChatBottomControls$lambda$5(initialInput, chatMode, bottomControlStatus, event, onClickSend, onCharacterLimitExceeded, onInputChanged, onClickImageIcon, modifier5, i6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 100663296;
        modifier2 = modifier;
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
            if (i7 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i4 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatBottomControls2.CxChatBottomControls$lambda$1$lambda$0(initialInput);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                Modifier modifier42 = modifier3;
                int i92 = i8;
                composer2 = composerStartRestartGroup;
                AnimatedVisibilityKt.AnimatedVisibility(!Intrinsics.areEqual(bottomControlStatus, CxChatViewState.BottomControlState.Hidden.INSTANCE), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-2142541329, true, new C291821(modifier42, bottomControlStatus, onClickImageIcon, snapshotState, onInputChanged, onClickSend, chatMode, onCharacterLimitExceeded, i8), composerStartRestartGroup, 54), composer2, 196608, 30);
                if (event != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$CxChatBottomControls$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19160invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19160invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CxChatBottomControls2.CxChatBottomControls$lambda$3(snapshotState, "");
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                i6 = i92;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CxChatBottomControls$lambda$1$lambda$0(String str) {
        return SnapshotState3.mutableStateOf$default(str, null, 2, null);
    }

    /* compiled from: CxChatBottomControls.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$CxChatBottomControls$1 */
    static final class C291821 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ CxChatViewState.BottomControlState $bottomControlStatus;
        final /* synthetic */ ChatMode $chatMode;
        final /* synthetic */ SnapshotState<String> $input$delegate;
        final /* synthetic */ int $inputMaxLength;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onCharacterLimitExceeded;
        final /* synthetic */ Function0<Unit> $onClickImageIcon;
        final /* synthetic */ Function2<ChatMode, String, Unit> $onClickSend;
        final /* synthetic */ Function1<String, Unit> $onInputChanged;

        /* JADX WARN: Multi-variable type inference failed */
        C291821(Modifier modifier, CxChatViewState.BottomControlState bottomControlState, Function0<Unit> function0, SnapshotState<String> snapshotState, Function1<? super String, Unit> function1, Function2<? super ChatMode, ? super String, Unit> function2, ChatMode chatMode, Function0<Unit> function02, int i) {
            this.$modifier = modifier;
            this.$bottomControlStatus = bottomControlState;
            this.$onClickImageIcon = function0;
            this.$input$delegate = snapshotState;
            this.$onInputChanged = function1;
            this.$onClickSend = function2;
            this.$chatMode = chatMode;
            this.$onCharacterLimitExceeded = function02;
            this.$inputMaxLength = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2142541329, i, -1, "com.robinhood.android.supportchat.thread.compose.CxChatBottomControls.<anonymous> (CxChatBottomControls.kt:45)");
            }
            Modifier modifier = this.$modifier;
            CxChatViewState.BottomControlState bottomControlState = this.$bottomControlStatus;
            Function0<Unit> function0 = this.$onClickImageIcon;
            final SnapshotState<String> snapshotState = this.$input$delegate;
            final Function1<String, Unit> function1 = this.$onInputChanged;
            final Function2<ChatMode, String, Unit> function2 = this.$onClickSend;
            final ChatMode chatMode = this.$chatMode;
            Function0<Unit> function02 = this.$onCharacterLimitExceeded;
            int i2 = this.$inputMaxLength;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            CxChatBottomControls2.ImagePickerButton(row6, bottomControlState.getImageButton(), function0, composer, 6);
            String strCxChatBottomControls$lambda$2 = CxChatBottomControls2.CxChatBottomControls$lambda$2(snapshotState);
            String placeholder = bottomControlState.getPlaceholder();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(snapshotState) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$CxChatBottomControls$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CxChatBottomControls2.C291821.invoke$lambda$4$lambda$1$lambda$0(function1, snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            CxChatBottomControls.SendButton sendButton = bottomControlState.getSendButton();
            CxChatBottomControls.Input input = bottomControlState.getInput();
            composer.startReplaceGroup(-1746271574);
            boolean zChanged2 = composer.changed(function2) | composer.changedInstance(chatMode) | composer.changed(snapshotState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$CxChatBottomControls$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatBottomControls2.C291821.invoke$lambda$4$lambda$3$lambda$2(function2, chatMode, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            CxChatBottomControls2.Input(row6, strCxChatBottomControls$lambda$2, placeholder, function12, sendButton, input, (Function0) objRememberedValue2, function02, i2, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(Function1 function1, SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            CxChatBottomControls2.CxChatBottomControls$lambda$3(snapshotState, it);
            function1.invoke(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function2 function2, ChatMode chatMode, SnapshotState snapshotState) {
            function2.invoke(chatMode, CxChatBottomControls2.CxChatBottomControls$lambda$2(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ImagePickerButton(final Row5 row5, final CxChatBottomControls.ImageButton imageButton, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        long jM21427getFg30d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(77493045);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(row5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(imageButton.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(77493045, i2, -1, "com.robinhood.android.supportchat.thread.compose.ImagePickerButton (CxChatBottomControls.kt:76)");
            }
            if (imageButton != CxChatBottomControls.ImageButton.Hidden) {
                Modifier modifierAlign = row5.align(SizeKt.wrapContentSize$default(TestTag3.testTag(Modifier.INSTANCE, "ImagePickerButton"), null, false, 3, null), Alignment.INSTANCE.getBottom());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(modifierAlign, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, PrimitiveResources_androidKt.dimensionResource(C29104R.dimen.chat_control_image_upload_bottom_margin, composerStartRestartGroup, 0), 5, null), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.IMAGE_24);
                if (imageButton == CxChatBottomControls.ImageButton.Enabled) {
                    composerStartRestartGroup.startReplaceGroup(-2096292520);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2096233992);
                    jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                String strStringResource = StringResources_androidKt.stringResource(C29104R.string.support_chat_thread_image_picker_icon_content_description, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CxChatBottomControls2.ImagePickerButton$lambda$7$lambda$6(imageButton, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21427getFg30d7_KjU, modifierM5146paddingqDBjuR0$default, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 32);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatBottomControls2.ImagePickerButton$lambda$8(row5, imageButton, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CxChatBottomControls$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImagePickerButton$lambda$7$lambda$6(CxChatBottomControls.ImageButton imageButton, Function0 function0) {
        if (imageButton == CxChatBottomControls.ImageButton.Enabled) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CxChatBottomControls$lambda$3(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Input(final Row5 row5, final String str, final String str2, final Function1<? super String, Unit> function1, final CxChatBottomControls.SendButton sendButton, final CxChatBottomControls.Input input, final Function0<Unit> function0, final Function0<Unit> function02, final int i, Composer composer, final int i2) {
        Row5 row52;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2007344369);
        if ((i2 & 6) == 0) {
            row52 = row5;
            i3 = (composerStartRestartGroup.changed(row52) ? 4 : 2) | i2;
        } else {
            row52 = row5;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(sendButton.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(input.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 67108864 : 33554432;
        }
        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2007344369, i3, -1, "com.robinhood.android.supportchat.thread.compose.Input (CxChatBottomControls.kt:114)");
            }
            CxChatBottomControls.SendButton sendButton2 = CxChatBottomControls.SendButton.Enabled;
            BentoTextInput8.Icon.Size24 size24 = (sendButton != sendButton2 || StringsKt.isBlank(str)) ? null : new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.MESSAGE_SEND_24, null, null, 6, null);
            Modifier modifierWeight$default = Row5.weight$default(row52, TestTag3.testTag(Modifier.INSTANCE, "Input"), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(617648407);
            String strStringResource = str2 == null ? StringResources_androidKt.stringResource(C29104R.string.support_chat_thread_input_hint, composerStartRestartGroup, 0) : str2;
            composerStartRestartGroup.endReplaceGroup();
            boolean z = sendButton == CxChatBottomControls.SendButton.Loading;
            String str3 = strStringResource;
            boolean z2 = input == CxChatBottomControls.Input.Enabled;
            boolean z3 = sendButton == sendButton2;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z4 = (i3 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CxChatBottomControls2.Input$lambda$10$lambda$9(function1, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function12 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean z5 = z3;
            boolean z6 = ((i3 & 112) == 32) | ((234881024 & i3) == 67108864) | ((29360128 & i3) == 8388608) | ((3670016 & i3) == 1048576);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CxChatBottomControls2.Input$lambda$12$lambda$11(str, i, function02, function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChatTextInput.ChatTextInput(str, function12, str3, z, size24, z5, (Function0) objRememberedValue2, 6, z2, modifierWeight$default, composerStartRestartGroup, ((i3 >> 3) & 14) | 12582912 | (BentoTextInput8.Icon.Size24.$stable << 12), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.CxChatBottomControlsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CxChatBottomControls2.Input$lambda$13(row5, str, str2, function1, sendButton, input, function0, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Input$lambda$10$lambda$9(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Input$lambda$12$lambda$11(String str, int i, Function0 function0, Function0 function02) {
        if (!StringsKt.isBlank(str)) {
            if (str.length() >= i) {
                function0.invoke();
            } else {
                function02.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
