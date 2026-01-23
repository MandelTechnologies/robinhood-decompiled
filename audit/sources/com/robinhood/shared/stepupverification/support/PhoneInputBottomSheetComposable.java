package com.robinhood.shared.stepupverification.support;

import android.view.KeyEvent;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PhoneInputBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u00068\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m3636d2 = {"PhoneInputBottomSheetComposable", "", "internationalInfo", "Lcom/robinhood/android/common/util/InternationalInfo;", "onSavePhoneNumber", "Lkotlin/Function2;", "", "onChangeCountryCode", "Lkotlin/Function0;", "onDismiss", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/stepupverification/support/PhoneInputBottomSheetDuxo;", "(Lcom/robinhood/android/common/util/InternationalInfo;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/stepupverification/support/PhoneInputBottomSheetDuxo;Landroidx/compose/runtime/Composer;II)V", "Content", "phoneNumber", "(Lcom/robinhood/android/common/util/InternationalInfo;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PhoneTextInputTestTag", "getPhoneTextInputTestTag$annotations", "()V", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/support/PhoneInputBottomSheetViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PhoneInputBottomSheetComposable {
    public static final String PhoneTextInputTestTag = "PhoneTextInput";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$6(InternationalInfo internationalInfo, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Content(internationalInfo, str, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneInputBottomSheetComposable$lambda$2(InternationalInfo internationalInfo, Function2 function2, Function0 function0, Function0 function02, Modifier modifier, PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo, int i, int i2, Composer composer, int i3) {
        PhoneInputBottomSheetComposable(internationalInfo, function2, function0, function02, modifier, phoneInputBottomSheetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPhoneTextInputTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PhoneInputBottomSheetComposable(final InternationalInfo internationalInfo, final Function2<? super InternationalInfo, ? super String, Unit> onSavePhoneNumber, final Function0<Unit> onChangeCountryCode, final Function0<Unit> onDismiss, Modifier modifier, PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        int i4;
        final PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo2;
        int i5;
        boolean z;
        Composer composer3;
        Object objRememberedValue;
        Composer composer4;
        final Modifier modifier3;
        final PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        Intrinsics.checkNotNullParameter(onSavePhoneNumber, "onSavePhoneNumber");
        Intrinsics.checkNotNullParameter(onChangeCountryCode, "onChangeCountryCode");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-28564606);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(internationalInfo) : composerStartRestartGroup.changedInstance(internationalInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSavePhoneNumber) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChangeCountryCode) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i & 196608) == 0) {
                if ((i2 & 32) != 0) {
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    if ((262144 & i) == 0 ? composerStartRestartGroup.changed(phoneInputBottomSheetDuxo) : composerStartRestartGroup.changedInstance(phoneInputBottomSheetDuxo)) {
                        i6 = 131072;
                    }
                    i3 |= i6;
                }
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i7 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 131072;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PhoneInputBottomSheetDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        phoneInputBottomSheetDuxo2 = (PhoneInputBottomSheetDuxo) baseDuxo;
                        i5 = i3 & (-458753);
                        z = false;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-28564606, i5, -1, "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposable (PhoneInputBottomSheetComposable.kt:46)");
                        }
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        composer3 = composer2;
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(phoneInputBottomSheetDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                        composer3.startReplaceGroup(5004770);
                        if ((((458752 & i5) ^ 196608) <= i4 && composer3.changedInstance(phoneInputBottomSheetDuxo2)) || (196608 & i5) == i4) {
                            z = true;
                        }
                        objRememberedValue = composer3.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PhoneInputBottomSheetComposable2(phoneInputBottomSheetDuxo2, null);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(internationalInfo, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, InternationalInfo.$stable | (i5 & 14));
                        Modifier modifier4 = modifier2;
                        PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo4 = phoneInputBottomSheetDuxo2;
                        composer4 = composer3;
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL_EDIT, null, null, null, 14, null), null, null, null, null, 61, null), true, false, true, false, false, null, 116, null), false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-515852965, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt.PhoneInputBottomSheetComposable.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer5, Integer num) {
                                invoke(rhModalBottomSheet5, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer5, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if ((i8 & 6) == 0) {
                                    i9 = i8 | ((i8 & 8) == 0 ? composer5.changed(RhModalBottomSheet) : composer5.changedInstance(RhModalBottomSheet) ? 4 : 2);
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-515852965, i9, -1, "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposable.<anonymous> (PhoneInputBottomSheetComposable.kt:65)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i10 = BentoTheme.$stable;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer5, i10).m21596getXxlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer5, i10).m21590getDefaultD9Ej5fM(), 5, null);
                                final InternationalInfo internationalInfo2 = internationalInfo;
                                final Function0<Unit> function0 = onChangeCountryCode;
                                final SnapshotState4<PhoneInputBottomSheetViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                                BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierM5146paddingqDBjuR0$default, ComposableLambda3.rememberComposableLambda(-281680680, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt.PhoneInputBottomSheetComposable.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i11) {
                                        if ((i11 & 3) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-281680680, i11, -1, "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposable.<anonymous>.<anonymous> (PhoneInputBottomSheetComposable.kt:68)");
                                        }
                                        PhoneInputBottomSheetComposable.Content(internationalInfo2, PhoneInputBottomSheetComposable.PhoneInputBottomSheetComposable$lambda$0(snapshotState4).getPhoneNumber(), function0, null, composer6, InternationalInfo.$stable, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), ComposableLambda3.rememberComposableLambda(59855848, true, new AnonymousClass2(userInteractionEventDescriptor, internationalInfo, onSavePhoneNumber, snapshotState4CollectAsStateWithLifecycle, RhModalBottomSheet, phoneInputBottomSheetDuxo2), composer5, 54), composer5, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: PhoneInputBottomSheetComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$2$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
                                final /* synthetic */ PhoneInputBottomSheetDuxo $duxo;
                                final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                                final /* synthetic */ InternationalInfo $internationalInfo;
                                final /* synthetic */ Function2<InternationalInfo, String, Unit> $onSavePhoneNumber;
                                final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;
                                final /* synthetic */ SnapshotState4<PhoneInputBottomSheetViewState> $viewState$delegate;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass2(UserInteractionEventDescriptor userInteractionEventDescriptor, InternationalInfo internationalInfo, Function2<? super InternationalInfo, ? super String, Unit> function2, SnapshotState4<PhoneInputBottomSheetViewState> snapshotState4, RhModalBottomSheet5 rhModalBottomSheet5, PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo) {
                                    this.$eventDescriptor = userInteractionEventDescriptor;
                                    this.$internationalInfo = internationalInfo;
                                    this.$onSavePhoneNumber = function2;
                                    this.$viewState$delegate = snapshotState4;
                                    this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                                    this.$duxo = phoneInputBottomSheetDuxo;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
                                    invoke(bentoNumpad4, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$1$lambda$0(Function2 function2, InternationalInfo internationalInfo, RhModalBottomSheet5 rhModalBottomSheet5, SnapshotState4 snapshotState4) {
                                    function2.invoke(internationalInfo, PhoneInputBottomSheetComposable.PhoneInputBottomSheetComposable$lambda$0(snapshotState4).getPhoneNumber());
                                    RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                    if ((i & 6) == 0) {
                                        i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(59855848, i2, -1, "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposable.<anonymous>.<anonymous> (PhoneInputBottomSheetComposable.kt:75)");
                                    }
                                    UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                                    final InternationalInfo internationalInfo = this.$internationalInfo;
                                    final Function2<InternationalInfo, String, Unit> function2 = this.$onSavePhoneNumber;
                                    final SnapshotState4<PhoneInputBottomSheetViewState> snapshotState4 = this.$viewState$delegate;
                                    final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                                    final PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo = this.$duxo;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL_EDIT, null, null, null, 14, null), UserInteractionEventData.Action.SAVE, null, null, null, 57, null), false, false, false, true, false, null, 110, null);
                                    String strStringResource = StringResources_androidKt.stringResource(C39791R.string.phone_input_primary_cta_text, composer, 0);
                                    BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                    boolean zBooleanValue = internationalInfo.getValidatePhoneNumber().invoke(PhoneInputBottomSheetComposable.PhoneInputBottomSheetComposable$lambda$0(snapshotState4).getPhoneNumber()).booleanValue();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChanged = composer.changed(function2) | composer.changedInstance(internationalInfo) | composer.changed(snapshotState4) | composer.changedInstance(rhModalBottomSheet5);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$2$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PhoneInputBottomSheetComposable.C399282.AnonymousClass2.invoke$lambda$6$lambda$1$lambda$0(function2, internationalInfo, rhModalBottomSheet5, snapshotState4);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    int i3 = i2;
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, type2, zBooleanValue, false, null, null, null, null, false, null, composer, 24576, 0, 8136);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i4 = BentoTheme.$stable;
                                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                    String strStringResource2 = StringResources_androidKt.stringResource(C39791R.string.phone_input_secondary_cta_text, composer, 0);
                                    BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(rhModalBottomSheet5);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$2$2$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PhoneInputBottomSheetComposable.C399282.AnonymousClass2.invoke$lambda$6$lambda$3$lambda$2(rhModalBottomSheet5);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, type3, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = composer.changedInstance(phoneInputBottomSheetDuxo) | composer.changedInstance(internationalInfo);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$2$2$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return PhoneInputBottomSheetComposable.C399282.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4(phoneInputBottomSheetDuxo, internationalInfo, (KeyEvent) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    BentoNumpadScreenLayout.BentoNumpadOnly(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue3, false, false, false, null, composer, (BentoNumpad4.$stable << 18) | 3072 | (3670016 & (i3 << 18)), 52);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
                                    RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$5$lambda$4(PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo, InternationalInfo internationalInfo, KeyEvent it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    phoneInputBottomSheetDuxo.handleKeyPress(it, internationalInfo);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54), composer4, ((i5 >> 9) & 14) | 1572864, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        phoneInputBottomSheetDuxo3 = phoneInputBottomSheetDuxo4;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = 131072;
                        phoneInputBottomSheetDuxo2 = phoneInputBottomSheetDuxo;
                        i5 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    phoneInputBottomSheetDuxo2 = phoneInputBottomSheetDuxo;
                    i5 = i3;
                    composer2 = composerStartRestartGroup;
                    i4 = 131072;
                }
                z = false;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                composer3 = composer2;
                final SnapshotState4<PhoneInputBottomSheetViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(phoneInputBottomSheetDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                composer3.startReplaceGroup(5004770);
                if (((458752 & i5) ^ 196608) <= i4) {
                    z = true;
                    objRememberedValue = composer3.rememberedValue();
                    if (z) {
                        objRememberedValue = new PhoneInputBottomSheetComposable2(phoneInputBottomSheetDuxo2, null);
                        composer3.updateRememberedValue(objRememberedValue);
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(internationalInfo, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, InternationalInfo.$stable | (i5 & 14));
                        Modifier modifier42 = modifier2;
                        PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo42 = phoneInputBottomSheetDuxo2;
                        composer4 = composer3;
                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, ModifiersKt.autoLogEvents$default(modifier42, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL_EDIT, null, null, null, 14, null), null, null, null, null, 61, null), true, false, true, false, false, null, 116, null), false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-515852965, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt.PhoneInputBottomSheetComposable.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer5, Integer num) {
                                invoke(rhModalBottomSheet5, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer5, int i8) {
                                int i9;
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if ((i8 & 6) == 0) {
                                    i9 = i8 | ((i8 & 8) == 0 ? composer5.changed(RhModalBottomSheet) : composer5.changedInstance(RhModalBottomSheet) ? 4 : 2);
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-515852965, i9, -1, "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposable.<anonymous> (PhoneInputBottomSheetComposable.kt:65)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i10 = BentoTheme.$stable;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer5, i10).m21596getXxlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer5, i10).m21590getDefaultD9Ej5fM(), 5, null);
                                final InternationalInfo internationalInfo2 = internationalInfo;
                                final Function0<Unit> function0 = onChangeCountryCode;
                                final SnapshotState4<PhoneInputBottomSheetViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                                BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierM5146paddingqDBjuR0$default, ComposableLambda3.rememberComposableLambda(-281680680, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt.PhoneInputBottomSheetComposable.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                        invoke(composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer6, int i11) {
                                        if ((i11 & 3) == 2 && composer6.getSkipping()) {
                                            composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-281680680, i11, -1, "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposable.<anonymous>.<anonymous> (PhoneInputBottomSheetComposable.kt:68)");
                                        }
                                        PhoneInputBottomSheetComposable.Content(internationalInfo2, PhoneInputBottomSheetComposable.PhoneInputBottomSheetComposable$lambda$0(snapshotState4).getPhoneNumber(), function0, null, composer6, InternationalInfo.$stable, 8);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), ComposableLambda3.rememberComposableLambda(59855848, true, new AnonymousClass2(userInteractionEventDescriptor2, internationalInfo, onSavePhoneNumber, snapshotState4CollectAsStateWithLifecycle2, RhModalBottomSheet, phoneInputBottomSheetDuxo2), composer5, 54), composer5, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: PhoneInputBottomSheetComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$2$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
                                final /* synthetic */ PhoneInputBottomSheetDuxo $duxo;
                                final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
                                final /* synthetic */ InternationalInfo $internationalInfo;
                                final /* synthetic */ Function2<InternationalInfo, String, Unit> $onSavePhoneNumber;
                                final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;
                                final /* synthetic */ SnapshotState4<PhoneInputBottomSheetViewState> $viewState$delegate;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass2(UserInteractionEventDescriptor userInteractionEventDescriptor, InternationalInfo internationalInfo, Function2<? super InternationalInfo, ? super String, Unit> function2, SnapshotState4<PhoneInputBottomSheetViewState> snapshotState4, RhModalBottomSheet5 rhModalBottomSheet5, PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo) {
                                    this.$eventDescriptor = userInteractionEventDescriptor;
                                    this.$internationalInfo = internationalInfo;
                                    this.$onSavePhoneNumber = function2;
                                    this.$viewState$delegate = snapshotState4;
                                    this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                                    this.$duxo = phoneInputBottomSheetDuxo;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
                                    invoke(bentoNumpad4, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$1$lambda$0(Function2 function2, InternationalInfo internationalInfo, RhModalBottomSheet5 rhModalBottomSheet5, SnapshotState4 snapshotState4) {
                                    function2.invoke(internationalInfo, PhoneInputBottomSheetComposable.PhoneInputBottomSheetComposable$lambda$0(snapshotState4).getPhoneNumber());
                                    RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                    if ((i & 6) == 0) {
                                        i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(59855848, i2, -1, "com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposable.<anonymous>.<anonymous> (PhoneInputBottomSheetComposable.kt:75)");
                                    }
                                    UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                                    final InternationalInfo internationalInfo = this.$internationalInfo;
                                    final Function2 function2 = this.$onSavePhoneNumber;
                                    final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                    final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                                    final PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo = this.$duxo;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL_EDIT, null, null, null, 14, null), UserInteractionEventData.Action.SAVE, null, null, null, 57, null), false, false, false, true, false, null, 110, null);
                                    String strStringResource = StringResources_androidKt.stringResource(C39791R.string.phone_input_primary_cta_text, composer, 0);
                                    BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                    boolean zBooleanValue = internationalInfo.getValidatePhoneNumber().invoke(PhoneInputBottomSheetComposable.PhoneInputBottomSheetComposable$lambda$0(snapshotState4).getPhoneNumber()).booleanValue();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChanged = composer.changed(function2) | composer.changedInstance(internationalInfo) | composer.changed(snapshotState4) | composer.changedInstance(rhModalBottomSheet5);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$2$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PhoneInputBottomSheetComposable.C399282.AnonymousClass2.invoke$lambda$6$lambda$1$lambda$0(function2, internationalInfo, rhModalBottomSheet5, snapshotState4);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    int i3 = i2;
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, type2, zBooleanValue, false, null, null, null, null, false, null, composer, 24576, 0, 8136);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i4 = BentoTheme.$stable;
                                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                    String strStringResource2 = StringResources_androidKt.stringResource(C39791R.string.phone_input_secondary_cta_text, composer, 0);
                                    BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(rhModalBottomSheet5);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$2$2$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PhoneInputBottomSheetComposable.C399282.AnonymousClass2.invoke$lambda$6$lambda$3$lambda$2(rhModalBottomSheet5);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, type3, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = composer.changedInstance(phoneInputBottomSheetDuxo) | composer.changedInstance(internationalInfo);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$PhoneInputBottomSheetComposable$2$2$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return PhoneInputBottomSheetComposable.C399282.AnonymousClass2.invoke$lambda$6$lambda$5$lambda$4(phoneInputBottomSheetDuxo, internationalInfo, (KeyEvent) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer.endReplaceGroup();
                                    BentoNumpadScreenLayout.BentoNumpadOnly(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue3, false, false, false, null, composer, (BentoNumpad4.$stable << 18) | 3072 | (3670016 & (i3 << 18)), 52);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
                                    RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$6$lambda$5$lambda$4(PhoneInputBottomSheetDuxo phoneInputBottomSheetDuxo, InternationalInfo internationalInfo, KeyEvent it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    phoneInputBottomSheetDuxo.handleKeyPress(it, internationalInfo);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54), composer4, ((i5 >> 9) & 14) | 1572864, 60);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        phoneInputBottomSheetDuxo3 = phoneInputBottomSheetDuxo42;
                    }
                } else {
                    z = true;
                    objRememberedValue = composer3.rememberedValue();
                    if (z) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                phoneInputBottomSheetDuxo3 = phoneInputBottomSheetDuxo;
                composer4 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PhoneInputBottomSheetComposable.PhoneInputBottomSheetComposable$lambda$2(internationalInfo, onSavePhoneNumber, onChangeCountryCode, onDismiss, modifier3, phoneInputBottomSheetDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i & 196608) == 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhoneInputBottomSheetViewState PhoneInputBottomSheetComposable$lambda$0(SnapshotState4<PhoneInputBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(final InternationalInfo internationalInfo, final String str, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-298892145);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(internationalInfo) : composerStartRestartGroup.changedInstance(internationalInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-298892145, i3, -1, "com.robinhood.shared.stepupverification.support.Content (PhoneInputBottomSheetComposable.kt:117)");
                        }
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        Modifier modifier5 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39791R.string.phone_input_title, composerStartRestartGroup, 0), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(TestTag3.testTag(companion2, PhoneTextInputTestTag), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7784getPhonePjHm6EE(), 0, null, null, null, 123, null);
                        PhoneNumberVisualTransformation phoneNumberVisualTransformation = new PhoneNumberVisualTransformation(internationalInfo, false, 2, null);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PhoneInputBottomSheetComposable.Content$lambda$5$lambda$4$lambda$3((String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextInput4.BentoHeroTextInput(str, (Function1) objRememberedValue, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, null, null, null, null, null, keyboardOptions, null, phoneNumberVisualTransformation, false, true, composerStartRestartGroup, ((i3 >> 3) & 14) | 805306416, 3072, 5624);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C39791R.string.phone_input_change_country_code, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL_EDIT, null, null, null, 14, null), UserInteractionEventData.Action.CHANGE_COUNTRY_CODE, null, null, null, 57, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i3 >> 6) & 14) | 24576, 0, 8168);
                        composer2 = composerStartRestartGroup;
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.support.PhoneInputBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PhoneInputBottomSheetComposable.Content$lambda$6(internationalInfo, str, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                modifier2 = modifier;
                if ((i3 & 1171) != 1170) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        Modifier modifier52 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39791R.string.phone_input_title, composerStartRestartGroup, 0), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
                        Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default22 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(TestTag3.testTag(companion22, PhoneTextInputTestTag), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7784getPhonePjHm6EE(), 0, null, null, null, 123, null);
                        PhoneNumberVisualTransformation phoneNumberVisualTransformation2 = new PhoneNumberVisualTransformation(internationalInfo, false, 2, null);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextInput4.BentoHeroTextInput(str, (Function1) objRememberedValue, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default22, null, null, null, null, null, null, keyboardOptions2, null, phoneNumberVisualTransformation2, false, true, composerStartRestartGroup, ((i3 >> 3) & 14) | 805306416, 3072, 5624);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C39791R.string.phone_input_change_country_code, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.WORKFLOW_REQUEST_PHONE_CALL_EDIT, null, null, null, 14, null), UserInteractionEventData.Action.CHANGE_COUNTRY_CODE, null, null, null, 57, null), false, false, false, true, false, null, 110, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i3 >> 6) & 14) | 24576, 0, 8168);
                        composer2 = composerStartRestartGroup;
                        Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$5$lambda$4$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
