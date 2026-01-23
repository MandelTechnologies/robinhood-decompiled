package com.robinhood.android.feature.account.onboarding.managmentstyle;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.feature.account.onboarding.AccountOnboardingComponents;
import com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposable4;
import com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionViewState;
import com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementTypeSelectionRow;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ManagementStyleSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aW\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a3\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0012\u001a3\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u0016\u001aI\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\n\u0010\u000e\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002"}, m3636d2 = {"ManagementStyleSelectionComposable", "", "onSelfDirectedAccountConfirmed", "Lkotlin/Function1;", "Lcom/robinhood/models/api/BrokerageAccountType;", "onManagedAccountConfirmed", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "ManagementStyleSelection", "viewState", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState$Loaded;", "onManagementTypeSelected", "Lcom/robinhood/models/api/ManagementType;", "(Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState$Loaded;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ManagementStyleRow", "row", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow;", "(Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ManagementStyleRowLearnMoreSheet", "learnMoreSheet", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$BottomSheet;", "managementType", "onDismissSheet", "(Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementTypeSelectionRow$BottomSheet;Lcom/robinhood/models/api/ManagementType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-account-onboarding_externalDebug", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState;", "showLearnMoreBottomSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ManagementStyleSelectionComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagementStyleRow$lambda$13(ManagementTypeSelectionRow managementTypeSelectionRow, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        ManagementStyleRow(managementTypeSelectionRow, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagementStyleRowLearnMoreSheet$lambda$14(ManagementTypeSelectionRow.BottomSheet bottomSheet, ManagementType managementType, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ManagementStyleRowLearnMoreSheet(bottomSheet, managementType, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagementStyleSelection$lambda$2(ManagementStyleSelectionViewState.Loaded loaded, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ManagementStyleSelection(loaded, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagementStyleSelectionComposable$lambda$1(Function1 function1, Function1 function12, Function0 function0, Modifier modifier, ManagementStyleSelectionDuxo managementStyleSelectionDuxo, int i, int i2, Composer composer, int i3) {
        ManagementStyleSelectionComposable(function1, function12, function0, modifier, managementStyleSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$15(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagementStyleSelectionComposable(final Function1<? super BrokerageAccountType, Unit> onSelfDirectedAccountConfirmed, final Function1<? super BrokerageAccountType, Unit> onManagedAccountConfirmed, final Function0<Unit> onBackClick, Modifier modifier, ManagementStyleSelectionDuxo managementStyleSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ManagementStyleSelectionDuxo managementStyleSelectionDuxo2;
        Modifier modifier3;
        int i4;
        CreationExtras defaultViewModelCreationExtras;
        ManagementStyleSelectionDuxo managementStyleSelectionDuxo3;
        final ManagementStyleSelectionDuxo managementStyleSelectionDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSelfDirectedAccountConfirmed, "onSelfDirectedAccountConfirmed");
        Intrinsics.checkNotNullParameter(onManagedAccountConfirmed, "onManagedAccountConfirmed");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2106356230);
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
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    managementStyleSelectionDuxo2 = managementStyleSelectionDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(managementStyleSelectionDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    managementStyleSelectionDuxo2 = managementStyleSelectionDuxo;
                }
                i3 |= i6;
            } else {
                managementStyleSelectionDuxo2 = managementStyleSelectionDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ManagementStyleSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelectionComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-57345);
                        managementStyleSelectionDuxo3 = (ManagementStyleSelectionDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2106356230, i4, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposable (ManagementStyleSelectionComposable.kt:69)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(managementStyleSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                        Composer composer2 = composerStartRestartGroup;
                        modifier2 = modifier3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(1991910338, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt.ManagementStyleSelectionComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1991910338, i8, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposable.<anonymous> (ManagementStyleSelectionComposable.kt:76)");
                                }
                                Function2<Composer, Integer, Unit> lambda$204092789$feature_account_onboarding_externalDebug = ManagementStyleSelectionComposable.INSTANCE.getLambda$204092789$feature_account_onboarding_externalDebug();
                                final Function0<Unit> function0 = onBackClick;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$204092789$feature_account_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1247571807, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt.ManagementStyleSelectionComposable.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1247571807, i9, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposable.<anonymous>.<anonymous> (ManagementStyleSelectionComposable.kt:79)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(815592663, true, new C166812(onSelfDirectedAccountConfirmed, onManagedAccountConfirmed, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306416, 316);
                        composerStartRestartGroup = composer2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        managementStyleSelectionDuxo4 = managementStyleSelectionDuxo3;
                    } else {
                        i4 = i3;
                    }
                }
                managementStyleSelectionDuxo3 = managementStyleSelectionDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(managementStyleSelectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU();
                Composer composer22 = composerStartRestartGroup;
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(1991910338, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt.ManagementStyleSelectionComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1991910338, i8, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposable.<anonymous> (ManagementStyleSelectionComposable.kt:76)");
                        }
                        Function2<Composer, Integer, Unit> lambda$204092789$feature_account_onboarding_externalDebug = ManagementStyleSelectionComposable.INSTANCE.getLambda$204092789$feature_account_onboarding_externalDebug();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$204092789$feature_account_onboarding_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1247571807, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt.ManagementStyleSelectionComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i9 & 6) == 0) {
                                    i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1247571807, i9, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposable.<anonymous>.<anonymous> (ManagementStyleSelectionComposable.kt:79)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(815592663, true, new C166812(onSelfDirectedAccountConfirmed, onManagedAccountConfirmed, snapshotState4CollectAsStateWithLifecycle2), composerStartRestartGroup, 54), composer22, ((i4 >> 9) & 14) | 805306416, 316);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                managementStyleSelectionDuxo4 = managementStyleSelectionDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                managementStyleSelectionDuxo4 = managementStyleSelectionDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ManagementStyleSelectionComposable4.ManagementStyleSelectionComposable$lambda$1(onSelfDirectedAccountConfirmed, onManagedAccountConfirmed, onBackClick, modifier4, managementStyleSelectionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ManagementStyleSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelectionComposable$2 */
    static final class C166812 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Function1<BrokerageAccountType, Unit> $onManagedAccountConfirmed;
        final /* synthetic */ Function1<BrokerageAccountType, Unit> $onSelfDirectedAccountConfirmed;
        final /* synthetic */ SnapshotState4<ManagementStyleSelectionViewState> $viewState$delegate;

        /* compiled from: ManagementStyleSelectionComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelectionComposable$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ManagementType.values().length];
                try {
                    iArr[ManagementType.SELF_DIRECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ManagementType.MANAGED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ManagementType.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C166812(Function1<? super BrokerageAccountType, Unit> function1, Function1<? super BrokerageAccountType, Unit> function12, SnapshotState4<? extends ManagementStyleSelectionViewState> snapshotState4) {
            this.$onSelfDirectedAccountConfirmed = function1;
            this.$onManagedAccountConfirmed = function12;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(815592663, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposable.<anonymous> (ManagementStyleSelectionComposable.kt:86)");
            }
            final ManagementStyleSelectionViewState managementStyleSelectionViewStateManagementStyleSelectionComposable$lambda$0 = ManagementStyleSelectionComposable4.ManagementStyleSelectionComposable$lambda$0(this.$viewState$delegate);
            if (managementStyleSelectionViewStateManagementStyleSelectionComposable$lambda$0 instanceof ManagementStyleSelectionViewState.Loaded) {
                composer.startReplaceGroup(691168688);
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                ManagementStyleSelectionViewState.Loaded loaded = (ManagementStyleSelectionViewState.Loaded) managementStyleSelectionViewStateManagementStyleSelectionComposable$lambda$0;
                composer.startReplaceGroup(-1746271574);
                boolean zChanged = composer.changed(this.$onSelfDirectedAccountConfirmed) | composer.changedInstance(managementStyleSelectionViewStateManagementStyleSelectionComposable$lambda$0) | composer.changed(this.$onManagedAccountConfirmed);
                final Function1<BrokerageAccountType, Unit> function1 = this.$onSelfDirectedAccountConfirmed;
                final Function1<BrokerageAccountType, Unit> function12 = this.$onManagedAccountConfirmed;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelectionComposable$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ManagementStyleSelectionComposable4.C166812.invoke$lambda$1$lambda$0(function1, managementStyleSelectionViewStateManagementStyleSelectionComposable$lambda$0, function12, (ManagementType) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ManagementStyleSelectionComposable4.ManagementStyleSelection(loaded, (Function1) objRememberedValue, modifierPadding, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(managementStyleSelectionViewStateManagementStyleSelectionComposable$lambda$0, ManagementStyleSelectionViewState.Loading.INSTANCE)) {
                    composer.startReplaceGroup(2100503217);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(691935659);
                AccountOnboardingComponents.PlaceholderAccountOnboardingSelectionScreen(2, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, 6, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, ManagementStyleSelectionViewState managementStyleSelectionViewState, Function1 function12, ManagementType managementType) {
            Intrinsics.checkNotNullParameter(managementType, "managementType");
            int i = WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
            if (i == 1) {
                function1.invoke(((ManagementStyleSelectionViewState.Loaded) managementStyleSelectionViewState).getBrokerageAccountType());
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unknown management type selected");
                }
                function12.invoke(((ManagementStyleSelectionViewState.Loaded) managementStyleSelectionViewState).getBrokerageAccountType());
            }
            return Unit.INSTANCE;
        }
    }

    private static final boolean ManagementStyleRow$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManagementStyleSelectionViewState ManagementStyleSelectionComposable$lambda$0(SnapshotState4<? extends ManagementStyleSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: ManagementStyleSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRowLearnMoreSheet$1 */
    static final class C166751 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ManagementTypeSelectionRow.BottomSheet $learnMoreSheet;
        final /* synthetic */ ManagementType $managementType;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onDismissSheet;
        final /* synthetic */ Function1<ManagementType, Unit> $onManagementTypeSelected;

        /* JADX WARN: Multi-variable type inference failed */
        C166751(Modifier modifier, ManagementTypeSelectionRow.BottomSheet bottomSheet, Function1<? super ManagementType, Unit> function1, ManagementType managementType, Function0<Unit> function0) {
            this.$modifier = modifier;
            this.$learnMoreSheet = bottomSheet;
            this.$onManagementTypeSelected = function1;
            this.$managementType = managementType;
            this.$onDismissSheet = function0;
        }

        public final void invoke(Composer composer, int i) {
            BentoTheme bentoTheme;
            float f;
            int i2;
            Object obj;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1915716682, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleRowLearnMoreSheet.<anonymous> (ManagementStyleSelectionComposable.kt:305)");
            }
            Modifier modifier = this.$modifier;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final ManagementTypeSelectionRow.BottomSheet bottomSheet = this.$learnMoreSheet;
            final Function1<ManagementType, Unit> function1 = this.$onManagementTypeSelected;
            final ManagementType managementType = this.$managementType;
            Function0<Unit> function0 = this.$onDismissSheet;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composer, i3).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme2.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21595getXsmallD9Ej5fM(), composer, 6, 0);
            String title = bottomSheet.getTitle();
            TextStyle displayCapsuleSmall = bentoTheme2.getTypography(composer, i3).getDisplayCapsuleSmall();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(title, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(bottomSheet.getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer, 6, 1), Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i3).getTextM(), composer, 0, 0, 8120);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(bottomSheet);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRowLearnMoreSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ManagementStyleSelectionComposable4.C166751.invoke$lambda$5$lambda$2$lambda$1(bottomSheet, (LazyListScope) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            Composer composer2 = composer;
            String markdownDisclosure = bottomSheet.getMarkdownDisclosure();
            composer2.startReplaceGroup(2014241402);
            if (markdownDisclosure != null) {
                float fM21590getDefaultD9Ej5fM = bentoTheme2.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM();
                obj = null;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, 0.0f, fM21590getDefaultD9Ej5fM, 1, null);
                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer2, i3).m21426getFg20d7_KjU();
                bentoTheme = bentoTheme2;
                i2 = 1;
                f = 0.0f;
                BentoMarkdownText2.BentoMarkdownText(markdownDisclosure, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer2, i3).getTextS(), companion3.m7919getCentere0LSkKk(), jM21426getFg20d7_KjU, 0L, false, composer, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                composer2 = composer;
            } else {
                bentoTheme = bentoTheme2;
                f = 0.0f;
                i2 = 1;
                obj = null;
            }
            composer2.endReplaceGroup();
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, bottomSheet.getPrimaryCtaIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), f, i2, obj);
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            String primaryCtaText = bottomSheet.getPrimaryCtaText();
            composer2.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer2.changed(function1) | composer2.changed(managementType.ordinal());
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRowLearnMoreSheet$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManagementStyleSelectionComposable4.C166751.invoke$lambda$5$lambda$4$lambda$3(function1, managementType);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, primaryCtaText, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            BentoTheme bentoTheme3 = bentoTheme;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, bottomSheet.getSecondaryCtaText(), com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, bottomSheet.getSecondaryCtaIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), bentoTheme3.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$2$lambda$1(ManagementTypeSelectionRow.BottomSheet bottomSheet, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final ImmutableList<ManagementTypeSelectionRow.ValueProp> valueProps = bottomSheet.getValueProps();
            final C16663x1cd4e4e3 c16663x1cd4e4e3 = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRowLearnMoreSheet$1$invoke$lambda$5$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ManagementTypeSelectionRow.ValueProp valueProp) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ManagementTypeSelectionRow.ValueProp) obj);
                }
            };
            LazyColumn.items(valueProps.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRowLearnMoreSheet$1$invoke$lambda$5$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c16663x1cd4e4e3.invoke(valueProps.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRowLearnMoreSheet$1$invoke$lambda$5$lambda$2$lambda$1$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final ManagementTypeSelectionRow.ValueProp valueProp = (ManagementTypeSelectionRow.ValueProp) valueProps.get(i);
                    composer.startReplaceGroup(1358975168);
                    BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(valueProp.getTitle(), ComposableLambda3.rememberComposableLambda(1351185500, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRowLearnMoreSheet$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i4) {
                            if ((i4 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1351185500, i4, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleRowLearnMoreSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagementStyleSelectionComposable.kt:338)");
                            }
                            String subtitle = valueProp.getSubtitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), null), BentoValuePropRow.Center, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, (BentoValuePropRow2.Icon.$stable << 6) | 27696, 32);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function1 function1, ManagementType managementType) {
            function1.invoke(managementType);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ManagementStyleSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelection$1 */
    static final class C166771 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<ManagementType, Unit> $onManagementTypeSelected;
        final /* synthetic */ ManagementStyleSelectionViewState.Loaded $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C166771(Modifier modifier, ManagementStyleSelectionViewState.Loaded loaded, Function1<? super ManagementType, Unit> function1) {
            this.$modifier = modifier;
            this.$viewState = loaded;
            this.$onManagementTypeSelected = function1;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1822415618, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelection.<anonymous> (ManagementStyleSelectionComposable.kt:134)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final ManagementStyleSelectionViewState.Loaded loaded = this.$viewState;
            final Function1<ManagementType, Unit> function1 = this.$onManagementTypeSelected;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWeight$default = Column5.weight$default(column6, companion2, 1.0f, false, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(loaded) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelection$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ManagementStyleSelectionComposable4.C166771.invoke$lambda$4$lambda$3$lambda$2(loaded, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 506);
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            BentoMarkdownText2.BentoMarkdownText(loaded.getFooterDisclosureMarkdown(), modifierM21618defaultFillMaxWidthPadding3ABfNKs, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(final ManagementStyleSelectionViewState.Loaded loaded, final Function1 function1, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1413340489, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelection$1$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    float fM21592getMediumD9Ej5fM;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1413340489, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagementStyleSelectionComposable.kt:145)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    String subtitle = loaded.getSubtitle();
                    if (subtitle == null || subtitle.length() == 0) {
                        composer.startReplaceGroup(1262382656);
                        fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1262289377);
                        fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM();
                        composer.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(loaded.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, fM21592getMediumD9Ej5fM, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final String subtitle = loaded.getSubtitle();
            if (subtitle != null) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(431046697, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelection$1$1$1$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(431046697, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagementStyleSelectionComposable.kt:160)");
                        }
                        BentoText2.m20747BentoText38GnDrw(subtitle, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
            }
            final ImmutableList<ManagementTypeSelectionRow> rows = loaded.getRows();
            final C16668x69053ff8 c16668x69053ff8 = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelection$1$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ManagementTypeSelectionRow managementTypeSelectionRow) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ManagementTypeSelectionRow) obj);
                }
            };
            LazyColumn.items(rows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelection$1$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c16668x69053ff8.invoke(rows.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleSelection$1$invoke$lambda$4$lambda$3$lambda$2$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    ManagementTypeSelectionRow managementTypeSelectionRow = (ManagementTypeSelectionRow) rows.get(i);
                    composer.startReplaceGroup(-123855836);
                    ManagementStyleSelectionComposable4.ManagementStyleRow(managementTypeSelectionRow, null, function1, composer, 0, 2);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagementStyleSelection(final ManagementStyleSelectionViewState.Loaded loaded, final Function1<? super ManagementType, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(835588169);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(loaded) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(835588169, i3, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelection (ManagementStyleSelectionComposable.kt:120)");
                }
                String str = null;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Object[] objArr5 = 0 == true ? 1 : 0;
                Object[] objArr6 = 0 == true ? 1 : 0;
                Object[] objArr7 = 0 == true ? 1 : 0;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.MANAGEMENT_TYPE_SELECTION, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, loaded.getSource(), null, null, str, objArr2, objArr3, null, null, objArr4, objArr5, objArr6, objArr7, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(loaded.getBrokerageAccountType()), str, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1822415618, true, new C166771(modifier3, loaded, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ManagementStyleSelectionComposable4.ManagementStyleSelection$lambda$2(loaded, function1, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String str2 = null;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr22 = 0 == true ? 1 : 0;
            Object[] objArr32 = 0 == true ? 1 : 0;
            Object[] objArr42 = 0 == true ? 1 : 0;
            Object[] objArr52 = 0 == true ? 1 : 0;
            Object[] objArr62 = 0 == true ? 1 : 0;
            Object[] objArr72 = 0 == true ? 1 : 0;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.MANAGEMENT_TYPE_SELECTION, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, loaded.getSource(), null, null, str2, objArr22, objArr32, null, null, objArr42, objArr52, objArr62, objArr72, null, objArr8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(loaded.getBrokerageAccountType()), str2, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1822415618, true, new C166771(modifier3, loaded, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagementStyleRow(final ManagementTypeSelectionRow managementTypeSelectionRow, Modifier modifier, final Function1<? super ManagementType, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean z;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String promotionalTitle;
        long jM21427getFg30d7_KjU;
        long jM21427getFg30d7_KjU2;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        long jM21427getFg30d7_KjU3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-240916821);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(managementTypeSelectionRow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-240916821, i3, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleRow (ManagementStyleSelectionComposable.kt:197)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                boolean enabled = managementTypeSelectionRow.getEnabled();
                String loggingIdentifier = managementTypeSelectionRow.getLoggingIdentifier();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 14) != 4) | ((i3 & 896) != 256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ManagementStyleSelectionComposable4.ManagementStyleRow$lambda$7$lambda$6(function1, managementTypeSelectionRow);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierClickableSelectionCard$default = AccountOnboardingComponents.clickableSelectionCard$default(modifier4, enabled, false, loggingIdentifier, (Function0) objRememberedValue2, 2, null);
                Modifier modifier5 = modifier4;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClickableSelectionCard$default);
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
                composerStartRestartGroup.startReplaceGroup(713136246);
                promotionalTitle = managementTypeSelectionRow.getPromotionalTitle();
                if (promotionalTitle == null && promotionalTitle.length() != 0) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 7, null);
                    String promotionalTitle2 = managementTypeSelectionRow.getPromotionalTitle();
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    if (managementTypeSelectionRow.getEnabled()) {
                        composerStartRestartGroup.startReplaceGroup(632725451);
                        jM21427getFg30d7_KjU3 = bentoTheme.getColors(composerStartRestartGroup, i5).m21456getPositive0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(632796720);
                        jM21427getFg30d7_KjU3 = bentoTheme.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(promotionalTitle2, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(jM21427getFg30d7_KjU3), null, bold, null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 24576, 0, 8168);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                String title = managementTypeSelectionRow.getTitle();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TextStyle textM = bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextM();
                FontWeight bold2 = FontWeight.INSTANCE.getBold();
                if (managementTypeSelectionRow.getEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(633149624);
                    jM21427getFg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(633092057);
                    jM21427getFg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Composer composer3 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(title, companion4, Color.m6701boximpl(jM21427getFg30d7_KjU), null, bold2, null, null, 0, false, 0, 0, null, 0, textM, composer3, 24624, 0, 8168);
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme2.getSpacing(composer3, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String subtitle = managementTypeSelectionRow.getSubtitle();
                TextStyle textS2 = bentoTheme2.getTypography(composer3, i6).getTextS();
                if (managementTypeSelectionRow.getEnabled()) {
                    composer3.startReplaceGroup(633499800);
                    jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composer3, i6).m21427getFg30d7_KjU();
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(633441272);
                    jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composer3, i6).m21426getFg20d7_KjU();
                    composer3.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(subtitle, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer3, 0, 0, 8184);
                Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, null, null, 59, null)), true, false, false, true, false, null, 108, null), 0.0f, bentoTheme2.getSpacing(composer3, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String learnMoreText = managementTypeSelectionRow.getLearnMoreText();
                boolean enabled2 = managementTypeSelectionRow.getEnabled();
                BentoTextButton3.Size size = BentoTextButton3.Size.f5148S;
                long jM21368getAccent0d7_KjU = bentoTheme2.getColors(composer3, i6).m21368getAccent0d7_KjU();
                composer3.startReplaceGroup(5004770);
                objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ManagementStyleSelectionComposable4.ManagementStyleRow$lambda$10$lambda$9$lambda$8(snapshotState);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                composer3.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, learnMoreText, modifierM5146paddingqDBjuR0$default3, null, size, enabled2, Color.m6701boximpl(jM21368getAccent0d7_KjU), composer3, 24582, 8);
                composer3.endNode();
                final ManagementTypeSelectionRow.BottomSheet learnMoreSheet = managementTypeSelectionRow.getLearnMoreSheet();
                if (ManagementStyleRow$lambda$4(snapshotState)) {
                    composer2 = composer3;
                } else {
                    composer3.startReplaceGroup(5004770);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ManagementStyleSelectionComposable4.ManagementStyleRow$lambda$12$lambda$11(snapshotState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue4, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(2003031287, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt.ManagementStyleRow.4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer4, Integer num) {
                            invoke(rhModalBottomSheet5, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(RhModalBottomSheet) : composer4.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2003031287, i7, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleRow.<anonymous> (ManagementStyleSelectionComposable.kt:276)");
                            }
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(learnMoreSheet.getLoggingIdentifier(), null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, 46, null), ComposableLambda3.rememberComposableLambda(1054362412, true, new AnonymousClass1(managementTypeSelectionRow, learnMoreSheet, function1, RhModalBottomSheet), composer4, 54), composer4, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: ManagementStyleSelectionComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRow$4$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ ManagementTypeSelectionRow.BottomSheet $learnMoreSheet;
                            final /* synthetic */ Function1<ManagementType, Unit> $onManagementTypeSelected;
                            final /* synthetic */ ManagementTypeSelectionRow $row;
                            final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(ManagementTypeSelectionRow managementTypeSelectionRow, ManagementTypeSelectionRow.BottomSheet bottomSheet, Function1<? super ManagementType, Unit> function1, RhModalBottomSheet5 rhModalBottomSheet5) {
                                this.$row = managementTypeSelectionRow;
                                this.$learnMoreSheet = bottomSheet;
                                this.$onManagementTypeSelected = function1;
                                this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1054362412, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleRow.<anonymous>.<anonymous> (ManagementStyleSelectionComposable.kt:284)");
                                }
                                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                                ManagementType managementType = this.$row.getManagementType();
                                ManagementTypeSelectionRow.BottomSheet bottomSheet = this.$learnMoreSheet;
                                Function1<ManagementType, Unit> function1 = this.$onManagementTypeSelected;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(this.$this_RhModalBottomSheet);
                                final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$ManagementStyleRow$4$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ManagementStyleSelectionComposable4.C166744.AnonymousClass1.invoke$lambda$1$lambda$0(rhModalBottomSheet5);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                ManagementStyleSelectionComposable4.ManagementStyleRowLearnMoreSheet(bottomSheet, managementType, function1, (Function0) objRememberedValue, modifierLogScreenTransitions$default, composer, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer3, 54), composer3, 1572870, 62);
                    composer2 = composer3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ManagementStyleSelectionComposable4.ManagementStyleRow$lambda$13(managementTypeSelectionRow, modifier3, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            boolean enabled3 = managementTypeSelectionRow.getEnabled();
            String loggingIdentifier2 = managementTypeSelectionRow.getLoggingIdentifier();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & 896) != 256) {
            }
            z = ((i3 & 14) != 4) | ((i3 & 896) != 256);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManagementStyleSelectionComposable4.ManagementStyleRow$lambda$7$lambda$6(function1, managementTypeSelectionRow);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierClickableSelectionCard$default2 = AccountOnboardingComponents.clickableSelectionCard$default(modifier4, enabled3, false, loggingIdentifier2, (Function0) objRememberedValue2, 2, null);
                Modifier modifier52 = modifier4;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClickableSelectionCard$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(713136246);
                    promotionalTitle = managementTypeSelectionRow.getPromotionalTitle();
                    if (promotionalTitle == null) {
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        String title2 = managementTypeSelectionRow.getTitle();
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        TextStyle textM2 = bentoTheme22.getTypography(composerStartRestartGroup, i62).getTextM();
                        FontWeight bold22 = FontWeight.INSTANCE.getBold();
                        if (managementTypeSelectionRow.getEnabled()) {
                        }
                        Composer composer32 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(title2, companion42, Color.m6701boximpl(jM21427getFg30d7_KjU), null, bold22, null, null, 0, false, 0, 0, null, 0, textM2, composer32, 24624, 0, 8168);
                        Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme22.getSpacing(composer32, i62).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        String subtitle2 = managementTypeSelectionRow.getSubtitle();
                        TextStyle textS22 = bentoTheme22.getTypography(composer32, i62).getTextS();
                        if (managementTypeSelectionRow.getEnabled()) {
                        }
                        BentoText2.m20747BentoText38GnDrw(subtitle2, modifierM5146paddingqDBjuR0$default22, Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS22, composer32, 0, 0, 8184);
                        Modifier modifierM5146paddingqDBjuR0$default32 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion42, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer32.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, null, null, 59, null)), true, false, false, true, false, null, 108, null), 0.0f, bentoTheme22.getSpacing(composer32, i62).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        String learnMoreText2 = managementTypeSelectionRow.getLearnMoreText();
                        boolean enabled22 = managementTypeSelectionRow.getEnabled();
                        BentoTextButton3.Size size2 = BentoTextButton3.Size.f5148S;
                        long jM21368getAccent0d7_KjU2 = bentoTheme22.getColors(composer32, i62).m21368getAccent0d7_KjU();
                        composer32.startReplaceGroup(5004770);
                        objRememberedValue3 = composer32.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composer32.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, learnMoreText2, modifierM5146paddingqDBjuR0$default32, null, size2, enabled22, Color.m6701boximpl(jM21368getAccent0d7_KjU2), composer32, 24582, 8);
                        composer32.endNode();
                        final ManagementTypeSelectionRow.BottomSheet learnMoreSheet2 = managementTypeSelectionRow.getLearnMoreSheet();
                        if (ManagementStyleRow$lambda$4(snapshotState)) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void ManagementStyleRow$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagementStyleRow$lambda$7$lambda$6(Function1 function1, ManagementTypeSelectionRow managementTypeSelectionRow) {
        function1.invoke(managementTypeSelectionRow.getManagementType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagementStyleRow$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState) {
        ManagementStyleRow$lambda$5(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagementStyleRow$lambda$12$lambda$11(SnapshotState snapshotState) {
        ManagementStyleRow$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagementStyleRowLearnMoreSheet(final ManagementTypeSelectionRow.BottomSheet bottomSheet, final ManagementType managementType, final Function1<? super ManagementType, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1556143647);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(bottomSheet) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(managementType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
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
                    ComposerKt.traceEventStart(-1556143647, i3, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleRowLearnMoreSheet (ManagementStyleSelectionComposable.kt:303)");
                }
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1915716682, true, new C166751(modifier4, bottomSheet, function1, managementType, function02), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ManagementStyleSelectionComposable4.ManagementStyleRowLearnMoreSheet$lambda$14(bottomSheet, managementType, function1, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1915716682, true, new C166751(modifier4, bottomSheet, function1, managementType, function02), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1950162334);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1950162334, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.Preview (ManagementStyleSelectionComposable.kt:416)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ManagementStyleSelectionComposable.INSTANCE.m14444getLambda$315164758$feature_account_onboarding_externalDebug(), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManagementStyleSelectionComposable4.Preview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
