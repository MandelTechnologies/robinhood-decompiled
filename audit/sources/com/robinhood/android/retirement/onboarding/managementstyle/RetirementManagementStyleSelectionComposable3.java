package com.robinhood.android.retirement.onboarding.managementstyle;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
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
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable3;
import com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.onboarding.IraManagementStyleSelectionData;
import com.robinhood.models.advisory.p304db.onboarding.IraManagementStyleSelectionData4;
import com.robinhood.models.advisory.p304db.onboarding.IraManagementStyleSelectionData5;
import com.robinhood.models.advisory.p304db.onboarding.ManagementStyleSelectionCta;
import com.robinhood.models.advisory.p304db.onboarding.ManagementStyleSelectionValueProp;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: RetirementManagementStyleSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a}\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001am\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002"}, m3636d2 = {"URI_ADVISORY_TERMS_SHEET", "", "IDENTIFIER_MANAGED_BUTTON", "IDENTIFIER_SELF_DIRECTED_BUTTON", "RetirementManagementStyleSelectionComposable", "", "onSelfDirectedAccountConfirmed", "Lkotlin/Function1;", "Lcom/robinhood/models/api/BrokerageAccountType;", "Lkotlin/ParameterName;", "name", "brokerageAccountType", "onManagedAccountConfirmed", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "IraManagementStyleSelectionContent", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/advisory/db/onboarding/IraManagementStyleSelectionData;", "(Lcom/robinhood/models/advisory/db/onboarding/IraManagementStyleSelectionData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/models/api/BrokerageAccountType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/retirement/onboarding/managementstyle/RetirementManagementStyleSelectionViewState;", "showTermsBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementManagementStyleSelectionComposable3 {
    public static final String IDENTIFIER_MANAGED_BUTTON = "Managed";
    public static final String IDENTIFIER_SELF_DIRECTED_BUTTON = "Self-directed";
    public static final String URI_ADVISORY_TERMS_SHEET = "advisory-terms-sheet";

    /* compiled from: RetirementManagementStyleSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IraManagementStyleSelectionData4.values().length];
            try {
                iArr[IraManagementStyleSelectionData4.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IraManagementStyleSelectionData4.MANAGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IraManagementStyleSelectionContent$lambda$16(IraManagementStyleSelectionData iraManagementStyleSelectionData, Function1 function1, Function1 function12, BrokerageAccountType brokerageAccountType, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IraManagementStyleSelectionContent(iraManagementStyleSelectionData, function1, function12, brokerageAccountType, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementManagementStyleSelectionComposable$lambda$1(Function1 function1, Function1 function12, BrokerageAccountType brokerageAccountType, Function0 function0, Modifier modifier, RetirementManagementStyleSelectionDuxo retirementManagementStyleSelectionDuxo, int i, int i2, Composer composer, int i3) {
        RetirementManagementStyleSelectionComposable(function1, function12, brokerageAccountType, function0, modifier, retirementManagementStyleSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RetirementManagementStyleSelectionComposable(final Function1<? super BrokerageAccountType, Unit> onSelfDirectedAccountConfirmed, final Function1<? super BrokerageAccountType, Unit> onManagedAccountConfirmed, final BrokerageAccountType brokerageAccountType, final Function0<Unit> onBackClick, Modifier modifier, RetirementManagementStyleSelectionDuxo retirementManagementStyleSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        RetirementManagementStyleSelectionDuxo retirementManagementStyleSelectionDuxo2;
        Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        RetirementManagementStyleSelectionDuxo retirementManagementStyleSelectionDuxo3;
        final Modifier modifier4;
        final RetirementManagementStyleSelectionDuxo retirementManagementStyleSelectionDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSelfDirectedAccountConfirmed, "onSelfDirectedAccountConfirmed");
        Intrinsics.checkNotNullParameter(onManagedAccountConfirmed, "onManagedAccountConfirmed");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1232435369);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onSelfDirectedAccountConfirmed) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onManagedAccountConfirmed) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    retirementManagementStyleSelectionDuxo2 = retirementManagementStyleSelectionDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(retirementManagementStyleSelectionDuxo2) ? 131072 : 65536;
                    i3 |= i5;
                } else {
                    retirementManagementStyleSelectionDuxo2 = retirementManagementStyleSelectionDuxo;
                }
                i3 |= i5;
            } else {
                retirementManagementStyleSelectionDuxo2 = retirementManagementStyleSelectionDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RetirementManagementStyleSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$RetirementManagementStyleSelectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$RetirementManagementStyleSelectionComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        retirementManagementStyleSelectionDuxo3 = (RetirementManagementStyleSelectionDuxo) baseDuxo;
                        i3 &= -458753;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1232435369, i3, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable (RetirementManagementStyleSelectionComposable.kt:69)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(retirementManagementStyleSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Composer composer2 = composerStartRestartGroup;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(794986349, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(794986349, i7, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous> (RetirementManagementStyleSelectionComposable.kt:78)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Function2<Composer, Integer, Unit> function2M2433x1f154f40 = RetirementManagementStyleSelectionComposable.INSTANCE.m2433x1f154f40();
                            final Function0<Unit> function0 = onBackClick;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2433x1f154f40, companion, ComposableLambda3.rememberComposableLambda(1495702702, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1495702702, i8, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous>.<anonymous> (RetirementManagementStyleSelectionComposable.kt:82)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(Modifier.INSTANCE, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1762057656, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(final PaddingValues paddingValues, Composer composer3, int i7) {
                            int i8;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i7 & 6) == 0) {
                                i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i8 = i7;
                            }
                            if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1762057656, i8, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous> (RetirementManagementStyleSelectionComposable.kt:90)");
                            }
                            final RetirementManagementStyleSelectionViewState retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 = RetirementManagementStyleSelectionComposable3.RetirementManagementStyleSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                            if (retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 instanceof RetirementManagementStyleSelectionViewState.Loaded) {
                                composer3.startReplaceGroup(369512437);
                                String str = null;
                                String str2 = null;
                                String str3 = null;
                                Object[] objArr = 0 == true ? 1 : 0;
                                Object[] objArr2 = 0 == true ? 1 : 0;
                                Object[] objArr3 = 0 == true ? 1 : 0;
                                Object[] objArr4 = 0 == true ? 1 : 0;
                                Object[] objArr5 = 0 == true ? 1 : 0;
                                Object[] objArr6 = 0 == true ? 1 : 0;
                                UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.IRA_MANAGEMENT_STYLE_SELECTION, null, null, null, 14, null), null, new Context(0, 0, 0, null, str, objArr2, str2, null, objArr3, objArr4, objArr5, str3, objArr6, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), str, null, str2, false, false, null, null, str3, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null));
                                final Function1<BrokerageAccountType, Unit> function1 = onSelfDirectedAccountConfirmed;
                                final Function1<BrokerageAccountType, Unit> function12 = onManagedAccountConfirmed;
                                final BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith, ComposableLambda3.rememberComposableLambda(-1545104331, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1545104331, i9, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous>.<anonymous> (RetirementManagementStyleSelectionComposable.kt:104)");
                                        }
                                        RetirementManagementStyleSelectionComposable3.IraManagementStyleSelectionContent(((RetirementManagementStyleSelectionViewState.Loaded) retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0).getData(), function1, function12, brokerageAccountType2, PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), 0.0f, 1, null), paddingValues), composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 48);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 instanceof RetirementManagementStyleSelectionViewState.Loading)) {
                                    composer3.startReplaceGroup(1120295516);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(370845437);
                                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), null, false, false, composer3, 0, 14);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805306416, 316);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    retirementManagementStyleSelectionDuxo4 = retirementManagementStyleSelectionDuxo3;
                }
                retirementManagementStyleSelectionDuxo3 = retirementManagementStyleSelectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends RetirementManagementStyleSelectionViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(retirementManagementStyleSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Composer composer22 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default2, ComposableLambda3.rememberComposableLambda(794986349, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(794986349, i7, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous> (RetirementManagementStyleSelectionComposable.kt:78)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Function2<Composer, Integer, Unit> function2M2433x1f154f40 = RetirementManagementStyleSelectionComposable.INSTANCE.m2433x1f154f40();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2433x1f154f40, companion, ComposableLambda3.rememberComposableLambda(1495702702, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1495702702, i8, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous>.<anonymous> (RetirementManagementStyleSelectionComposable.kt:82)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(Modifier.INSTANCE, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1762057656, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(final PaddingValues paddingValues, Composer composer3, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1762057656, i8, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous> (RetirementManagementStyleSelectionComposable.kt:90)");
                        }
                        final RetirementManagementStyleSelectionViewState retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 = RetirementManagementStyleSelectionComposable3.RetirementManagementStyleSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                        if (retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 instanceof RetirementManagementStyleSelectionViewState.Loaded) {
                            composer3.startReplaceGroup(369512437);
                            String str = null;
                            String str2 = null;
                            String str3 = null;
                            Object[] objArr = 0 == true ? 1 : 0;
                            Object[] objArr2 = 0 == true ? 1 : 0;
                            Object[] objArr3 = 0 == true ? 1 : 0;
                            Object[] objArr4 = 0 == true ? 1 : 0;
                            Object[] objArr5 = 0 == true ? 1 : 0;
                            Object[] objArr6 = 0 == true ? 1 : 0;
                            UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.IRA_MANAGEMENT_STYLE_SELECTION, null, null, null, 14, null), null, new Context(0, 0, 0, null, str, objArr2, str2, null, objArr3, objArr4, objArr5, str3, objArr6, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), str, null, str2, false, false, null, null, str3, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null));
                            final Function1<? super BrokerageAccountType, Unit> function1 = onSelfDirectedAccountConfirmed;
                            final Function1<? super BrokerageAccountType, Unit> function12 = onManagedAccountConfirmed;
                            final BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith, ComposableLambda3.rememberComposableLambda(-1545104331, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i9) {
                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1545104331, i9, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous>.<anonymous> (RetirementManagementStyleSelectionComposable.kt:104)");
                                    }
                                    RetirementManagementStyleSelectionComposable3.IraManagementStyleSelectionContent(((RetirementManagementStyleSelectionViewState.Loaded) retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0).getData(), function1, function12, brokerageAccountType2, PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), 0.0f, 1, null), paddingValues), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 instanceof RetirementManagementStyleSelectionViewState.Loading)) {
                                composer3.startReplaceGroup(1120295516);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(370845437);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), null, false, false, composer3, 0, 14);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer22, 805306416, 316);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                retirementManagementStyleSelectionDuxo4 = retirementManagementStyleSelectionDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                retirementManagementStyleSelectionDuxo4 = retirementManagementStyleSelectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementManagementStyleSelectionComposable3.RetirementManagementStyleSelectionComposable$lambda$1(onSelfDirectedAccountConfirmed, onManagedAccountConfirmed, brokerageAccountType, onBackClick, modifier4, retirementManagementStyleSelectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i4 == 0) {
                }
                if ((i2 & 32) == 0) {
                    retirementManagementStyleSelectionDuxo3 = retirementManagementStyleSelectionDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends RetirementManagementStyleSelectionViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(retirementManagementStyleSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i622 = BentoTheme.$stable;
                Composer composer222 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default22, ComposableLambda3.rememberComposableLambda(794986349, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(794986349, i7, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous> (RetirementManagementStyleSelectionComposable.kt:78)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Function2<Composer, Integer, Unit> function2M2433x1f154f40 = RetirementManagementStyleSelectionComposable.INSTANCE.m2433x1f154f40();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2433x1f154f40, companion, ComposableLambda3.rememberComposableLambda(1495702702, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1495702702, i8, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous>.<anonymous> (RetirementManagementStyleSelectionComposable.kt:82)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(Modifier.INSTANCE, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme22.getColors(composerStartRestartGroup, i622).m21371getBg0d7_KjU(), bentoTheme22.getColors(composerStartRestartGroup, i622).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1762057656, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(final PaddingValues paddingValues, Composer composer3, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1762057656, i8, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous> (RetirementManagementStyleSelectionComposable.kt:90)");
                        }
                        final RetirementManagementStyleSelectionViewState retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 = RetirementManagementStyleSelectionComposable3.RetirementManagementStyleSelectionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle22);
                        if (retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 instanceof RetirementManagementStyleSelectionViewState.Loaded) {
                            composer3.startReplaceGroup(369512437);
                            String str = null;
                            String str2 = null;
                            String str3 = null;
                            Object[] objArr = 0 == true ? 1 : 0;
                            Object[] objArr2 = 0 == true ? 1 : 0;
                            Object[] objArr3 = 0 == true ? 1 : 0;
                            Object[] objArr4 = 0 == true ? 1 : 0;
                            Object[] objArr5 = 0 == true ? 1 : 0;
                            Object[] objArr6 = 0 == true ? 1 : 0;
                            UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.IRA_MANAGEMENT_STYLE_SELECTION, null, null, null, 14, null), null, new Context(0, 0, 0, null, str, objArr2, str2, null, objArr3, objArr4, objArr5, str3, objArr6, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), str, null, str2, false, false, null, null, str3, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null));
                            final Function1<? super BrokerageAccountType, Unit> function1 = onSelfDirectedAccountConfirmed;
                            final Function1<? super BrokerageAccountType, Unit> function12 = onManagedAccountConfirmed;
                            final BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith, ComposableLambda3.rememberComposableLambda(-1545104331, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt.RetirementManagementStyleSelectionComposable.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i9) {
                                    if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1545104331, i9, -1, "com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposable.<anonymous>.<anonymous> (RetirementManagementStyleSelectionComposable.kt:104)");
                                    }
                                    RetirementManagementStyleSelectionComposable3.IraManagementStyleSelectionContent(((RetirementManagementStyleSelectionViewState.Loaded) retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0).getData(), function1, function12, brokerageAccountType2, PaddingKt.padding(SizeKt.fillMaxSize$default(ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null), 0.0f, 1, null), paddingValues), composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            composer3.endReplaceGroup();
                        } else {
                            if (!(retirementManagementStyleSelectionViewStateRetirementManagementStyleSelectionComposable$lambda$0 instanceof RetirementManagementStyleSelectionViewState.Loading)) {
                                composer3.startReplaceGroup(1120295516);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(370845437);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), null, false, false, composer3, 0, 14);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer222, 805306416, 316);
                composerStartRestartGroup = composer222;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                retirementManagementStyleSelectionDuxo4 = retirementManagementStyleSelectionDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean IraManagementStyleSelectionContent$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementManagementStyleSelectionViewState RetirementManagementStyleSelectionComposable$lambda$0(SnapshotState4<? extends RetirementManagementStyleSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: RetirementManagementStyleSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$IraManagementStyleSelectionContent$3 */
    static final class C271113 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ IraManagementStyleSelectionData $data;
        final /* synthetic */ SnapshotState<Boolean> $showTermsBottomSheet$delegate;

        C271113(IraManagementStyleSelectionData iraManagementStyleSelectionData, SnapshotState<Boolean> snapshotState) {
            this.$data = iraManagementStyleSelectionData;
            this.$showTermsBottomSheet$delegate = snapshotState;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(406354109, i, -1, "com.robinhood.android.retirement.onboarding.managementstyle.IraManagementStyleSelectionContent.<anonymous> (RetirementManagementStyleSelectionComposable.kt:291)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
            IraManagementStyleSelectionData iraManagementStyleSelectionData = this.$data;
            final SnapshotState<Boolean> snapshotState = this.$showTermsBottomSheet$delegate;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
            BentoText2.m20747BentoText38GnDrw(iraManagementStyleSelectionData.getTermsSheet().getTitle(), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8184);
            BentoText2.m20747BentoText38GnDrw(iraManagementStyleSelectionData.getTermsSheet().getBody(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8186);
            composer.endNode();
            String ctaText = iraManagementStyleSelectionData.getTermsSheet().getCtaText();
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$IraManagementStyleSelectionContent$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RetirementManagementStyleSelectionComposable3.C271113.invoke$lambda$3$lambda$2$lambda$1(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, ctaText, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composer, 24582, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(SnapshotState snapshotState) {
            RetirementManagementStyleSelectionComposable3.IraManagementStyleSelectionContent$lambda$4(snapshotState, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IraManagementStyleSelectionContent(IraManagementStyleSelectionData data, final Function1<? super BrokerageAccountType, Unit> onSelfDirectedAccountConfirmed, final Function1<? super BrokerageAccountType, Unit> onManagedAccountConfirmed, final BrokerageAccountType brokerageAccountType, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final UriHandler uriHandler;
        Object objRememberedValue;
        SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        IraManagementStyleSelectionData5 layoutContent;
        float f;
        Object obj;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        final SnapshotState snapshotState3;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        IraManagementStyleSelectionData iraManagementStyleSelectionData;
        final Modifier modifier3;
        char c;
        String str;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onSelfDirectedAccountConfirmed, "onSelfDirectedAccountConfirmed");
        Intrinsics.checkNotNullParameter(onManagedAccountConfirmed, "onManagedAccountConfirmed");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Composer composerStartRestartGroup = composer.startRestartGroup(350568817);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelfDirectedAccountConfirmed) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onManagedAccountConfirmed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(350568817, i3, -1, "com.robinhood.android.retirement.onboarding.managementstyle.IraManagementStyleSelectionContent (RetirementManagementStyleSelectionComposable.kt:137)");
                }
                uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier5 = modifier4;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 7, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(data.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(!(data.getLayoutContent() instanceof IraManagementStyleSelectionData5.ManagementStyleSelectionImageContent) ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8120);
                composer2 = composerStartRestartGroup;
                layoutContent = data.getLayoutContent();
                if (layoutContent instanceof IraManagementStyleSelectionData5.ManagementStyleSelectionImageContent) {
                    f = 0.0f;
                    obj = null;
                    if (layoutContent instanceof IraManagementStyleSelectionData5.ManagementStyleSelectionListContent) {
                        composer2.startReplaceGroup(246940896);
                        for (ManagementStyleSelectionValueProp managementStyleSelectionValueProp : ((IraManagementStyleSelectionData5.ManagementStyleSelectionListContent) layoutContent).getItems()) {
                            Composer composer3 = composer2;
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, new BentoBaseRowState.Start.Icon(managementStyleSelectionValueProp.getIcon(), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), 2, null), managementStyleSelectionValueProp.getTitle(), managementStyleSelectionValueProp.getDescription(), null, null, null, false, false, false, 0L, null, composer3, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 3953);
                            composer2 = composer3;
                        }
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(247486651);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composer2.startReplaceGroup(245900505);
                    IraManagementStyleSelectionData5.ManagementStyleSelectionImageContent managementStyleSelectionImageContent = (IraManagementStyleSelectionData5.ManagementStyleSelectionImageContent) layoutContent;
                    BentoText2.m20747BentoText38GnDrw(managementStyleSelectionImageContent.getBody(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), composer2, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8120);
                    obj = null;
                    f = 0.0f;
                    BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(managementStyleSelectionImageContent.getImageUrl(), null, null, null, 0, null, composer2, 0, 62), null, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m5158heightInVpY3zN4$default(companion3, 0.0f, C2002Dp.m7995constructorimpl(400), 1, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 7, null), null, ContentScale.INSTANCE.getFit(), 0.0f, null, composer2, 24624, 104);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion4, 0.0f, bentoTheme2.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), composer2, 6, 1);
                String disclosure = data.getDisclosure();
                MarkdownStyle markdownStyleM16260copyR0sFphs$default = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer2, BentoMarkdownText.$stable), null, null, null, null, bentoTheme2.getTypography(composer2, i6).getTextS(), null, new MarkdownStyle.Link(bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU(), false, false, 6, null), bentoTheme2.getColors(composer2, i6).m21426getFg20d7_KjU(), null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), null, 1327, null);
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(uriHandler);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    snapshotState2 = snapshotState;
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RetirementManagementStyleSelectionComposable3.IraManagementStyleSelectionContent$lambda$13$lambda$8$lambda$7(uriHandler, snapshotState2, (String) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    snapshotState2 = snapshotState;
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                snapshotState3 = snapshotState2;
                BentoMarkdownText2.BentoMarkdownText(disclosure, modifierM21622defaultHorizontalPaddingWMci_g0, markdownStyleM16260copyR0sFphs$default, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue2, composer4, MarkdownStyle.$stable << 6, 8);
                composerStartRestartGroup = composer4;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1625299635);
                for (final ManagementStyleSelectionCta managementStyleSelectionCta : data.getCtas()) {
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    int i7 = WhenMappings.$EnumSwitchMapping$0[managementStyleSelectionCta.getCtaType().ordinal()];
                    if (i7 != 1) {
                        c = 2;
                        str = i7 != 2 ? "" : IDENTIFIER_MANAGED_BUTTON;
                    } else {
                        c = 2;
                        str = IDENTIFIER_SELF_DIRECTED_BUTTON;
                    }
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(companion6, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, str, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, obj);
                    String text = managementStyleSelectionCta.getText();
                    BentoButtons.Type type2 = managementStyleSelectionCta.isPrimary() ? BentoButtons.Type.Primary : BentoButtons.Type.Secondary;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(managementStyleSelectionCta) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RetirementManagementStyleSelectionComposable3.m2434x49b51237(managementStyleSelectionCta, onSelfDirectedAccountConfirmed, brokerageAccountType, onManagedAccountConfirmed);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer5 = composerStartRestartGroup;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, text, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, type2, false, false, null, null, null, null, false, null, composer5, 0, 0, 8168);
                    composerStartRestartGroup = composer5;
                    f = 0.0f;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (IraManagementStyleSelectionContent$lambda$3(snapshotState3)) {
                    iraManagementStyleSelectionData = data;
                } else {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RetirementManagementStyleSelectionComposable3.IraManagementStyleSelectionContent$lambda$15$lambda$14(snapshotState3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    iraManagementStyleSelectionData = data;
                    Composer composer6 = composerStartRestartGroup;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(406354109, true, new C271113(iraManagementStyleSelectionData, snapshotState3), composerStartRestartGroup, 54), composer6, 1572870, 62);
                    composerStartRestartGroup = composer6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                iraManagementStyleSelectionData = data;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final IraManagementStyleSelectionData iraManagementStyleSelectionData2 = iraManagementStyleSelectionData;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return RetirementManagementStyleSelectionComposable3.IraManagementStyleSelectionContent$lambda$16(iraManagementStyleSelectionData2, onSelfDirectedAccountConfirmed, onManagedAccountConfirmed, brokerageAccountType, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Alignment.Companion companion7 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion7.getCenterHorizontally();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Column6 column63 = Column6.INSTANCE;
                Modifier modifier52 = modifier4;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierWeight$default2 = Column5.weight$default(column63, SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 1.0f, false, 2, null);
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default2, 0.0f, 0.0f, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 7, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(data.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion32, bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 0), Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(!(data.getLayoutContent() instanceof IraManagementStyleSelectionData5.ManagementStyleSelectionImageContent) ? TextAlign.INSTANCE.m7919getCentere0LSkKk() : TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8120);
                    composer2 = composerStartRestartGroup;
                    layoutContent = data.getLayoutContent();
                    if (layoutContent instanceof IraManagementStyleSelectionData5.ManagementStyleSelectionImageContent) {
                    }
                    composer2.endNode();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion42, 0.0f, bentoTheme22.getSpacing(composer2, i62).m21590getDefaultD9Ej5fM(), composer2, 6, 1);
                    String disclosure2 = data.getDisclosure();
                    MarkdownStyle markdownStyleM16260copyR0sFphs$default2 = MarkdownStyle.m16260copyR0sFphs$default(BentoMarkdownText.INSTANCE.getStyle(composer2, BentoMarkdownText.$stable), null, null, null, null, bentoTheme22.getTypography(composer2, i62).getTextS(), null, new MarkdownStyle.Link(bentoTheme22.getColors(composer2, i62).m21426getFg20d7_KjU(), false, false, 6, null), bentoTheme22.getColors(composer2, i62).m21426getFg20d7_KjU(), null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), null, 1327, null);
                    composer2.startReplaceGroup(-1633490746);
                    zChangedInstance = composer2.changedInstance(uriHandler);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance) {
                        snapshotState2 = snapshotState;
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.onboarding.managementstyle.RetirementManagementStyleSelectionComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return RetirementManagementStyleSelectionComposable3.IraManagementStyleSelectionContent$lambda$13$lambda$8$lambda$7(uriHandler, snapshotState2, (String) obj2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                        composer2.endReplaceGroup();
                        Composer composer42 = composer2;
                        snapshotState3 = snapshotState2;
                        BentoMarkdownText2.BentoMarkdownText(disclosure2, modifierM21622defaultHorizontalPaddingWMci_g02, markdownStyleM16260copyR0sFphs$default2, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue2, composer42, MarkdownStyle.$stable << 6, 8);
                        composerStartRestartGroup = composer42;
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 7, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                        ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor32 = companion52.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy32, companion52.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion52.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion52.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion52.getSetModifier());
                            Column6 column622 = Column6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(-1625299635);
                            while (r1.hasNext()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (IraManagementStyleSelectionContent$lambda$3(snapshotState3)) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IraManagementStyleSelectionContent$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IraManagementStyleSelectionContent$lambda$13$lambda$8$lambda$7(UriHandler uriHandler, SnapshotState snapshotState, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (Intrinsics.areEqual(uri, URI_ADVISORY_TERMS_SHEET)) {
            IraManagementStyleSelectionContent$lambda$4(snapshotState, true);
        } else {
            uriHandler.openUri(uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IraManagementStyleSelectionContent$lambda$13$lambda$12$lambda$11$lambda$10$lambda$9 */
    public static final Unit m2434x49b51237(ManagementStyleSelectionCta managementStyleSelectionCta, Function1 function1, BrokerageAccountType brokerageAccountType, Function1 function12) {
        int i = WhenMappings.$EnumSwitchMapping$0[managementStyleSelectionCta.getCtaType().ordinal()];
        if (i == 1) {
            function1.invoke(brokerageAccountType);
        } else if (i == 2) {
            function12.invoke(brokerageAccountType);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IraManagementStyleSelectionContent$lambda$15$lambda$14(SnapshotState snapshotState) {
        IraManagementStyleSelectionContent$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }
}
