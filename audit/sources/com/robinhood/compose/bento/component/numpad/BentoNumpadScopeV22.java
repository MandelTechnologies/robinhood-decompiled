package com.robinhood.compose.bento.component.numpad;

import android.view.KeyEvent;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.plaid.internal.EnumC7081g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: BentoNumpadScopeV2.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u001a\u001a\u00020\u00102\n\u0010\u001b\u001a\u00060\u0014j\u0002`\u0015JA\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010%J\u007f\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100)2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010*\u001a\u00020 2\b\b\u0002\u0010+\u001a\u00020 2\b\b\u0002\u0010,\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010-\u001a\u00020 H\u0007¢\u0006\u0002\u0010.R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00150\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2Impl;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "internalSharedTextFieldValue", "", "", "Landroidx/compose/runtime/MutableState;", "getInternalValue", "key", "initialValue", "setInternalValue", "", "value", "keyPressEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "getKeyPressEventFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "keyPressEventFlow$delegate", "Lkotlin/Lazy;", "onKeyPress", "keyEvent", "BentoNumpadOnly", "modifier", "Landroidx/compose/ui/Modifier;", "isNumpadEnabled", "", "showDelimiter", "delimiterLocalized", "backspaceOverride", "Lcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;", "(Landroidx/compose/ui/Modifier;ZZZLcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;Landroidx/compose/runtime/Composer;II)V", "BentoNumpadWithButton", "buttonText", "buttonOnClick", "Lkotlin/Function0;", "isButtonEnabled", "isButtonVisible", "isButtonLoading", "buttonPositionTop", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZZZZLcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;ZLandroidx/compose/runtime/Composer;III)V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoNumpadScopeV22 implements BentoNumpadScopeV2 {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final Map<String, SnapshotState<String>> internalSharedTextFieldValue;

    /* renamed from: keyPressEventFlow$delegate, reason: from kotlin metadata */
    private final Lazy keyPressEventFlow;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadOnly$lambda$3(BentoNumpadScopeV22 bentoNumpadScopeV22, Modifier modifier, boolean z, boolean z2, boolean z3, CustomKeyConfig customKeyConfig, int i, int i2, Composer composer, int i3) {
        bentoNumpadScopeV22.BentoNumpadOnly(modifier, z, z2, z3, customKeyConfig, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadWithButton$lambda$5(BentoNumpadScopeV22 bentoNumpadScopeV22, String str, Function0 function0, Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CustomKeyConfig customKeyConfig, boolean z7, int i, int i2, int i3, Composer composer, int i4) {
        bentoNumpadScopeV22.BentoNumpadWithButton(str, function0, modifier, z, z2, z3, z4, z5, z6, customKeyConfig, z7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public BentoNumpadScopeV22(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.internalSharedTextFieldValue = new LinkedHashMap();
        this.keyPressEventFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BentoNumpadScopeV22.keyPressEventFlow_delegate$lambda$1();
            }
        });
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2
    public CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2
    public SnapshotState<String> getInternalValue(String key, String initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        if (key == null) {
            return SnapshotState3.mutableStateOf$default(initialValue, null, 2, null);
        }
        Map<String, SnapshotState<String>> map = this.internalSharedTextFieldValue;
        SnapshotState<String> snapshotStateMutableStateOf$default = map.get(key);
        if (snapshotStateMutableStateOf$default == null) {
            snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(initialValue, null, 2, null);
            map.put(key, snapshotStateMutableStateOf$default);
        }
        return snapshotStateMutableStateOf$default;
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2
    public void setInternalValue(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SnapshotState<String> snapshotState = this.internalSharedTextFieldValue.get(key);
        if (snapshotState != null) {
            snapshotState.setValue(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedFlow2 keyPressEventFlow_delegate$lambda$1() {
        return SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2
    public SharedFlow2<KeyEvent> getKeyPressEventFlow() {
        return (SharedFlow2) this.keyPressEventFlow.getValue();
    }

    /* compiled from: BentoNumpadScopeV2.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl$onKeyPress$1", m3645f = "BentoNumpadScopeV2.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl$onKeyPress$1 */
    static final class C325711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C325711(KeyEvent keyEvent, Continuation<? super C325711> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BentoNumpadScopeV22.this.new C325711(this.$keyEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C325711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2<KeyEvent> keyPressEventFlow = BentoNumpadScopeV22.this.getKeyPressEventFlow();
                KeyEvent keyEvent = this.$keyEvent;
                this.label = 1;
                if (keyPressEventFlow.emit(keyEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void onKeyPress(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C325711(keyEvent, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void BentoNumpadOnly(Modifier modifier, boolean z, boolean z2, boolean z3, CustomKeyConfig customKeyConfig, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        CustomKeyConfig customKeyConfig2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        final boolean z7;
        final CustomKeyConfig customKeyConfig3;
        final boolean z8;
        final boolean z9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1716806581);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z4 = z;
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z5 = z2;
                    i3 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z6 = z3;
                        i3 |= composerStartRestartGroup.changed(z6) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            customKeyConfig2 = customKeyConfig;
                            i3 |= composerStartRestartGroup.changed(customKeyConfig2) ? 16384 : 8192;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(this) ? 131072 : 65536;
                        }
                        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z9 = z4;
                            z7 = z5;
                            z8 = z6;
                            customKeyConfig3 = customKeyConfig2;
                        } else {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i8 != 0) {
                                z4 = true;
                            }
                            if (i4 != 0) {
                                z5 = true;
                            }
                            if (i5 != 0) {
                                z6 = false;
                            }
                            if (i6 != 0) {
                                customKeyConfig2 = null;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1716806581, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl.BentoNumpadOnly (BentoNumpadScopeV2.kt:62)");
                            }
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChangedInstance = composerStartRestartGroup.changedInstance(this);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new BentoNumpadScopeV23(this);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier5 = modifier4;
                            boolean z10 = z5;
                            boolean z11 = z6;
                            CustomKeyConfig customKeyConfig4 = customKeyConfig2;
                            boolean z12 = z4;
                            BentoNumpad3.BentoNumpad(modifier5, (Function1) ((KFunction) objRememberedValue), z10, customKeyConfig4, z11, z12, composerStartRestartGroup, (i3 & 910) | ((i3 >> 3) & 7168) | (57344 & (i3 << 3)) | ((i3 << 12) & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            z7 = z10;
                            customKeyConfig3 = customKeyConfig4;
                            z8 = z11;
                            z9 = z12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoNumpadScopeV22.BentoNumpadOnly$lambda$3(this.f$0, modifier3, z9, z7, z8, customKeyConfig3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    customKeyConfig2 = customKeyConfig;
                    if ((i2 & 32) != 0) {
                    }
                    if ((74899 & i3) == 74898) {
                        if (i7 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(this);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new BentoNumpadScopeV23(this);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            boolean z102 = z5;
                            boolean z112 = z6;
                            CustomKeyConfig customKeyConfig42 = customKeyConfig2;
                            boolean z122 = z4;
                            BentoNumpad3.BentoNumpad(modifier52, (Function1) ((KFunction) objRememberedValue), z102, customKeyConfig42, z112, z122, composerStartRestartGroup, (i3 & 910) | ((i3 >> 3) & 7168) | (57344 & (i3 << 3)) | ((i3 << 12) & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                            z7 = z102;
                            customKeyConfig3 = customKeyConfig42;
                            z8 = z112;
                            z9 = z122;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z6 = z3;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                customKeyConfig2 = customKeyConfig;
                if ((i2 & 32) != 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z5 = z2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z6 = z3;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            customKeyConfig2 = customKeyConfig;
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z5 = z2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z6 = z3;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        customKeyConfig2 = customKeyConfig;
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void BentoNumpadWithButton(final String buttonText, final Function0<Unit> buttonOnClick, Modifier modifier, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CustomKeyConfig customKeyConfig, boolean z7, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z8;
        int i6;
        boolean z9;
        int i7;
        boolean z10;
        int i8;
        boolean z11;
        int i9;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zChangedInstance;
        Object objRememberedValue;
        final boolean z13;
        final boolean z14;
        final Modifier modifier3;
        final boolean z15;
        final boolean z16;
        final boolean z17;
        final boolean z18;
        final boolean z19;
        final CustomKeyConfig customKeyConfig2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(buttonOnClick, "buttonOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-611907352);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(buttonText) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(buttonOnClick) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z8 = z;
                    i4 |= composerStartRestartGroup.changed(z8) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z9 = z2;
                        i4 |= composerStartRestartGroup.changed(z9) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        z10 = z3;
                    } else {
                        z10 = z3;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        z11 = z4;
                    } else {
                        z11 = z4;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z11) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        z12 = z5;
                    } else {
                        z12 = z5;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(z12) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changed(z6) ? 67108864 : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i & 805306368) == 0) {
                                i13 = i12;
                                i4 |= composerStartRestartGroup.changed(customKeyConfig) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (composerStartRestartGroup.changed(z7) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i16 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i16 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
                            }
                            i17 = i16;
                            if ((i4 & 306783379) != 306783378 && (i17 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                customKeyConfig2 = customKeyConfig;
                                z19 = z12;
                                z16 = z9;
                                z17 = z10;
                                z18 = z11;
                                modifier3 = modifier2;
                                z15 = z8;
                                z14 = z6;
                                z13 = z7;
                            } else {
                                Modifier modifier4 = i18 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    z8 = true;
                                }
                                if (i6 != 0) {
                                    z9 = true;
                                }
                                if (i7 != 0) {
                                    z10 = true;
                                }
                                if (i8 != 0) {
                                    z11 = false;
                                }
                                boolean z20 = i9 == 0 ? true : z12;
                                boolean z21 = i11 == 0 ? false : z6;
                                CustomKeyConfig customKeyConfig3 = i13 == 0 ? null : customKeyConfig;
                                boolean z22 = i15 == 0 ? z7 : true;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-611907352, i4, i17, "com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl.BentoNumpadWithButton (BentoNumpadScopeV2.kt:87)");
                                }
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChangedInstance = composerStartRestartGroup.changedInstance(this);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new BentoNumpadScopeV24(this);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i19 = i4 << 6;
                                int i20 = i4 << 3;
                                int i21 = (i19 & 1879048192) | (i19 & 896) | ((i4 >> 6) & 14) | (i19 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128) | ((i17 << 24) & 234881024);
                                int i22 = (i4 >> 24) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                                boolean z23 = z11;
                                boolean z24 = z22;
                                boolean z25 = z8;
                                BentoNumpad3.BentoNumpad(modifier4, (Function1) ((KFunction) objRememberedValue), buttonText, buttonOnClick, z25, z9, z10, z23, z24, z20, z21, customKeyConfig3, composerStartRestartGroup, i21, i22, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                boolean z26 = z21;
                                z13 = z24;
                                z14 = z26;
                                modifier3 = modifier4;
                                z15 = z25;
                                z16 = z9;
                                z17 = z10;
                                z18 = z23;
                                z19 = z20;
                                customKeyConfig2 = customKeyConfig3;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2Impl$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoNumpadScopeV22.BentoNumpadWithButton$lambda$5(this.f$0, buttonText, buttonOnClick, modifier3, z15, z16, z17, z18, z19, z14, customKeyConfig2, z13, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i13 = i12;
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        i17 = i16;
                        if ((i4 & 306783379) != 306783378) {
                            if (i18 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChangedInstance = composerStartRestartGroup.changedInstance(this);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue = new BentoNumpadScopeV24(this);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                int i192 = i4 << 6;
                                int i202 = i4 << 3;
                                int i212 = (i192 & 1879048192) | (i192 & 896) | ((i4 >> 6) & 14) | (i192 & 7168) | (i202 & 57344) | (i202 & 458752) | (i202 & 3670016) | (i202 & 29360128) | ((i17 << 24) & 234881024);
                                int i222 = (i4 >> 24) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                                boolean z232 = z11;
                                boolean z242 = z22;
                                boolean z252 = z8;
                                BentoNumpad3.BentoNumpad(modifier4, (Function1) ((KFunction) objRememberedValue), buttonText, buttonOnClick, z252, z9, z10, z232, z242, z20, z21, customKeyConfig3, composerStartRestartGroup, i212, i222, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                boolean z262 = z21;
                                z13 = z242;
                                z14 = z262;
                                modifier3 = modifier4;
                                z15 = z252;
                                z16 = z9;
                                z17 = z10;
                                z18 = z232;
                                z19 = z20;
                                customKeyConfig2 = customKeyConfig3;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    i17 = i16;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z9 = z2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                i17 = i16;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z8 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z9 = z2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            i17 = i16;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z8 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z9 = z2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i17 = i16;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
