package com.robinhood.android.isa.contributions;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.isa.contributions.IsaContributionBottomSheet4;
import com.robinhood.android.isa.contributions.IsaContributionBottomSheetDuxo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import kotlin.Metadata;
import kotlin.Tuples4;
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

/* compiled from: IsaContributionBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, m3636d2 = {"", "accountNumber", "", "taxYear", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDuxo;", "duxo", "IsaContributionBottomSheet", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetDuxo;Landroidx/compose/runtime/Composer;II)V", "primaryText", "metaText", "startIcon", "", "showBottomDivider", "IsaContributionRow", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "tint", "borderColor", "IsaContributionRowStartIcon-Klgx-Pg", "(JJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "IsaContributionRowStartIcon", "Lcom/robinhood/android/isa/contributions/IsaContributionBottomSheetViewState;", "viewState", "lib-isa-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionBottomSheet4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaContributionBottomSheet$lambda$1(String str, int i, Function0 function0, Modifier modifier, IsaContributionBottomSheetDuxo isaContributionBottomSheetDuxo, int i2, int i3, Composer composer, int i4) {
        IsaContributionBottomSheet(str, i, function0, modifier, isaContributionBottomSheetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaContributionRow$lambda$5(String str, String str2, Function2 function2, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        IsaContributionRow(str, str2, function2, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaContributionRowStartIcon_Klgx_Pg$lambda$7(long j, long j2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m15714IsaContributionRowStartIconKlgxPg(j, j2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IsaContributionBottomSheet(final String accountNumber, final int i, final Function0<Unit> onDismissRequest, Modifier modifier, IsaContributionBottomSheetDuxo isaContributionBottomSheetDuxo, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        IsaContributionBottomSheetDuxo isaContributionBottomSheetDuxo2;
        int i5;
        Modifier modifier3;
        Composer composer2;
        IsaContributionBottomSheetDuxo isaContributionBottomSheetDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        final Modifier modifier4;
        Composer composer3;
        final IsaContributionBottomSheetDuxo isaContributionBottomSheetDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1632456734);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    isaContributionBottomSheetDuxo2 = isaContributionBottomSheetDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(isaContributionBottomSheetDuxo2) ? 16384 : 8192;
                    i4 |= i7;
                } else {
                    isaContributionBottomSheetDuxo2 = isaContributionBottomSheetDuxo;
                }
                i4 |= i7;
            } else {
                isaContributionBottomSheetDuxo2 = isaContributionBottomSheetDuxo;
            }
            i5 = i4;
            if ((i5 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 16) == 0) {
                        IsaContributionBottomSheetDuxo.InitArgs initArgs = new IsaContributionBottomSheetDuxo.InitArgs(accountNumber, i);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(IsaContributionBottomSheetDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$IsaContributionBottomSheet$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$IsaContributionBottomSheet$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        i5 &= -57345;
                        isaContributionBottomSheetDuxo3 = (IsaContributionBottomSheetDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        isaContributionBottomSheetDuxo3 = isaContributionBottomSheetDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 16) != 0) {
                        i5 &= -57345;
                    }
                    modifier3 = modifier2;
                    isaContributionBottomSheetDuxo3 = isaContributionBottomSheetDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1632456734, i5, -1, "com.robinhood.android.isa.contributions.IsaContributionBottomSheet (IsaContributionBottomSheet.kt:46)");
                }
                Composer composer4 = composer2;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(isaContributionBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-378310921, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt.IsaContributionBottomSheet.1

                    /* compiled from: IsaContributionBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$IsaContributionBottomSheet$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;
                        final /* synthetic */ SnapshotState4<IsaContributionBottomSheetViewState> $viewState$delegate;

                        AnonymousClass1(RhModalBottomSheet5 rhModalBottomSheet5, SnapshotState4<IsaContributionBottomSheetViewState> snapshotState4) {
                            this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                            this.$viewState$delegate = snapshotState4;
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
                                ComposerKt.traceEventStart(-845667838, i, -1, "com.robinhood.android.isa.contributions.IsaContributionBottomSheet.<anonymous>.<anonymous> (IsaContributionBottomSheet.kt:54)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
                            final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                            SnapshotState4<IsaContributionBottomSheetViewState> snapshotState4 = this.$viewState$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_title, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_description, new Object[]{IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getTaxYearLabel(), IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getAllowance()}, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, composer, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getTaxYearLabel() + PlaceholderUtils.XXShortPlaceholderText + StringResources_androidKt.stringResource(C19913R.string.contribution_section_allowance_row_label, composer, 0), null, null, null, null, false, false, false, 0L, null, composer, 0, 0, 4090);
                            String strStringResource = StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_contributed_label, composer, 0);
                            String contributed = IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getContributed();
                            if (contributed.length() == 0) {
                                contributed = "—";
                            }
                            IsaContributionBottomSheet isaContributionBottomSheet = IsaContributionBottomSheet.INSTANCE;
                            IsaContributionBottomSheet4.IsaContributionRow(strStringResource, contributed, isaContributionBottomSheet.m15712getLambda$999996742$lib_isa_contributions_externalDebug(), null, false, composer, 384, 24);
                            String strStringResource2 = StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_remaining_label, composer, 0);
                            String remaining = IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getRemaining();
                            if (remaining.length() == 0) {
                                remaining = "—";
                            }
                            IsaContributionBottomSheet4.IsaContributionRow(strStringResource2, remaining, isaContributionBottomSheet.getLambda$1257848497$lib_isa_contributions_externalDebug(), null, false, composer, 384, 24);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(rhModalBottomSheet5);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$IsaContributionBottomSheet$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return IsaContributionBottomSheet4.C198801.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(rhModalBottomSheet5);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_close_button, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
                            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer5, Integer num) {
                        invoke(rhModalBottomSheet5, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer5, int i8) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i8 & 6) == 0) {
                            i8 |= (i8 & 8) == 0 ? composer5.changed(RhModalBottomSheet) : composer5.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-378310921, i8, -1, "com.robinhood.android.isa.contributions.IsaContributionBottomSheet.<anonymous> (IsaContributionBottomSheet.kt:53)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-845667838, true, new AnonymousClass1(RhModalBottomSheet, snapshotState4CollectAsStateWithLifecycle), composer5, 54), composer5, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer4, 54);
                int i8 = i5 >> 6;
                modifier4 = modifier3;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, modifier4, false, null, null, 0L, composableLambdaRememberComposableLambda, composer4, (i8 & 14) | 1572864 | (i8 & 112), 60);
                composer3 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                isaContributionBottomSheetDuxo4 = isaContributionBottomSheetDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                isaContributionBottomSheetDuxo4 = isaContributionBottomSheetDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$1(accountNumber, i, onDismissRequest, modifier4, isaContributionBottomSheetDuxo4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i2 & 24576) != 0) {
        }
        i5 = i4;
        if ((i5 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                final SnapshotState4<IsaContributionBottomSheetViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(isaContributionBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-378310921, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt.IsaContributionBottomSheet.1

                    /* compiled from: IsaContributionBottomSheet.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$IsaContributionBottomSheet$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;
                        final /* synthetic */ SnapshotState4<IsaContributionBottomSheetViewState> $viewState$delegate;

                        AnonymousClass1(RhModalBottomSheet5 rhModalBottomSheet5, SnapshotState4<IsaContributionBottomSheetViewState> snapshotState4) {
                            this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                            this.$viewState$delegate = snapshotState4;
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
                                ComposerKt.traceEventStart(-845667838, i, -1, "com.robinhood.android.isa.contributions.IsaContributionBottomSheet.<anonymous>.<anonymous> (IsaContributionBottomSheet.kt:54)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
                            final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                            SnapshotState4<IsaContributionBottomSheetViewState> snapshotState4 = this.$viewState$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_title, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_description, new Object[]{IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getTaxYearLabel(), IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getAllowance()}, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, composer, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getTaxYearLabel() + PlaceholderUtils.XXShortPlaceholderText + StringResources_androidKt.stringResource(C19913R.string.contribution_section_allowance_row_label, composer, 0), null, null, null, null, false, false, false, 0L, null, composer, 0, 0, 4090);
                            String strStringResource = StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_contributed_label, composer, 0);
                            String contributed = IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getContributed();
                            if (contributed.length() == 0) {
                                contributed = "—";
                            }
                            IsaContributionBottomSheet isaContributionBottomSheet = IsaContributionBottomSheet.INSTANCE;
                            IsaContributionBottomSheet4.IsaContributionRow(strStringResource, contributed, isaContributionBottomSheet.m15712getLambda$999996742$lib_isa_contributions_externalDebug(), null, false, composer, 384, 24);
                            String strStringResource2 = StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_remaining_label, composer, 0);
                            String remaining = IsaContributionBottomSheet4.IsaContributionBottomSheet$lambda$0(snapshotState4).getRemaining();
                            if (remaining.length() == 0) {
                                remaining = "—";
                            }
                            IsaContributionBottomSheet4.IsaContributionRow(strStringResource2, remaining, isaContributionBottomSheet.getLambda$1257848497$lib_isa_contributions_externalDebug(), null, false, composer, 384, 24);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(rhModalBottomSheet5);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$IsaContributionBottomSheet$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return IsaContributionBottomSheet4.C198801.AnonymousClass1.invoke$lambda$4$lambda$3$lambda$2(rhModalBottomSheet5);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, StringResources_androidKt.stringResource(C19913R.string.contribution_bottom_sheet_close_button, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
                            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer5, Integer num) {
                        invoke(rhModalBottomSheet5, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer5, int i82) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i82 & 6) == 0) {
                            i82 |= (i82 & 8) == 0 ? composer5.changed(RhModalBottomSheet) : composer5.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i82 & 19) == 18 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-378310921, i82, -1, "com.robinhood.android.isa.contributions.IsaContributionBottomSheet.<anonymous> (IsaContributionBottomSheet.kt:53)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-845667838, true, new AnonymousClass1(RhModalBottomSheet, snapshotState4CollectAsStateWithLifecycle2), composer5, 54), composer5, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer42, 54);
                int i82 = i5 >> 6;
                modifier4 = modifier3;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, modifier4, false, null, null, 0L, composableLambdaRememberComposableLambda2, composer42, (i82 & 14) | 1572864 | (i82 & 112), 60);
                composer3 = composer42;
                if (ComposerKt.isTraceInProgress()) {
                }
                isaContributionBottomSheetDuxo4 = isaContributionBottomSheetDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IsaContributionBottomSheetViewState IsaContributionBottomSheet$lambda$0(SnapshotState4<IsaContributionBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IsaContributionRow(final String str, final String str2, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        boolean z3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer2;
        final Modifier modifier3;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2010823890);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 6) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z2;
                        composer2 = composerStartRestartGroup;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        z3 = i5 == 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2010823890, i3, -1, "com.robinhood.android.isa.contributions.IsaContributionRow (IsaContributionBottomSheet.kt:119)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        float f = 16;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, C2002Dp.m7995constructorimpl(f), composerStartRestartGroup, 54, 0), 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Modifier modifierM21617paddingIfContentSizeNonZeroqDBjuR0$default = ModifiersKt.m21617paddingIfContentSizeNonZeroqDBjuR0$default(companion3, 0.0f, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21617paddingIfContentSizeNonZeroqDBjuR0$default);
                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                        function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                        composerStartRestartGroup.endNode();
                        Modifier modifier5 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(str3, Row5.weight$default(row6, companion3, 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i3 & 14, 0, 16380);
                        BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 16382);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(-515085950);
                        if (z3) {
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(SizeKt.fillMaxWidth$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 1, null), companion.getBottomStart()), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                        }
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        z4 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return IsaContributionBottomSheet4.IsaContributionRow$lambda$5(str, str2, function2, modifier3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z2 = z;
                if ((i3 & 9363) != 9362) {
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        float f2 = 16;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, C2002Dp.m7995constructorimpl(f2), composerStartRestartGroup, 54, 0), 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier modifierM21617paddingIfContentSizeNonZeroqDBjuR0$default2 = ModifiersKt.m21617paddingIfContentSizeNonZeroqDBjuR0$default(companion32, 0.0f, C2002Dp.m7995constructorimpl(f2), 0.0f, 0.0f, 13, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21617paddingIfContentSizeNonZeroqDBjuR0$default2);
                            Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                                function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                                composerStartRestartGroup.endNode();
                                Modifier modifier52 = modifier4;
                                BentoText2.m20747BentoText38GnDrw(str3, Row5.weight$default(row62, companion32, 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i3 & 14, 0, 16380);
                                BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 16382);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(-515085950);
                                if (z3) {
                                }
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                                z4 = z3;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z2 = z;
            if ((i3 & 9363) != 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str4 = str2;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: IsaContributionRowStartIcon-Klgx-Pg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15714IsaContributionRowStartIconKlgxPg(final long j, final long j2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1442247990);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1442247990, i3, -1, "com.robinhood.android.isa.contributions.IsaContributionRowStartIcon (IsaContributionBottomSheet.kt:162)");
                }
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(24));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BoxKt.Box(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(9)), C2002Dp.m7995constructorimpl((float) 0.5d), j2, RoundedCornerShape2.getCircleShape()), j, RoundedCornerShape2.getCircleShape()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.contributions.IsaContributionBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaContributionBottomSheet4.IsaContributionRowStartIcon_Klgx_Pg$lambda$7(j, j2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(modifier3, C2002Dp.m7995constructorimpl(24));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                BoxKt.Box(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(9)), C2002Dp.m7995constructorimpl((float) 0.5d), j2, RoundedCornerShape2.getCircleShape()), j, RoundedCornerShape2.getCircleShape()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
