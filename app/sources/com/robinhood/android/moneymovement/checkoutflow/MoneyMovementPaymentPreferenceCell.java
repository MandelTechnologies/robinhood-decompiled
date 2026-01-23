package com.robinhood.android.moneymovement.checkoutflow;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: MoneyMovementPaymentPreferenceCell.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"MoneyMovementPaymentPreferenceCell", "", "modifier", "Landroidx/compose/ui/Modifier;", "titleOverride", "", "secondaryHeaderTextOverride", "duxo", "Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/moneymovement/checkoutflow/MoneyMovementPaymentPreferenceCellDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MoneyMovementPaymentPreferenceCell {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoneyMovementPaymentPreferenceCell$lambda$3(Modifier modifier, String str, String str2, MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, int i, int i2, Composer composer, int i3) {
        MoneyMovementPaymentPreferenceCell(modifier, str, str2, moneyMovementPaymentPreferenceCellDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MoneyMovementPaymentPreferenceCell(Modifier modifier, String str, String str2, MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        String str4;
        MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo2;
        Modifier modifier3;
        String strStringResource;
        final String strStringResource2;
        Composer composer2;
        int i4;
        final MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo3;
        Composer composer3;
        final MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo4;
        final String str5;
        final Modifier modifier4;
        final String str6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2082679348);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str3 = str;
                int i6 = composerStartRestartGroup.changed(str3) ? 32 : 16;
                i3 |= i6;
            } else {
                str3 = str;
            }
            i3 |= i6;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                str4 = str2;
                int i7 = composerStartRestartGroup.changed(str4) ? 256 : 128;
                i3 |= i7;
            } else {
                str4 = str2;
            }
            i3 |= i7;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                moneyMovementPaymentPreferenceCellDuxo2 = moneyMovementPaymentPreferenceCellDuxo;
                int i8 = composerStartRestartGroup.changedInstance(moneyMovementPaymentPreferenceCellDuxo2) ? 2048 : 1024;
                i3 |= i8;
            } else {
                moneyMovementPaymentPreferenceCellDuxo2 = moneyMovementPaymentPreferenceCellDuxo;
            }
            i3 |= i8;
        } else {
            moneyMovementPaymentPreferenceCellDuxo2 = moneyMovementPaymentPreferenceCellDuxo;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            str6 = str3;
            str5 = str4;
            moneyMovementPaymentPreferenceCellDuxo4 = moneyMovementPaymentPreferenceCellDuxo2;
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    strStringResource = StringResources_androidKt.stringResource(C22205R.string.default_title, composerStartRestartGroup, 0);
                    i3 &= -113;
                } else {
                    strStringResource = str3;
                }
                if ((i2 & 4) != 0) {
                    strStringResource2 = StringResources_androidKt.stringResource(C22205R.string.default_sub_header, composerStartRestartGroup, 0);
                    i3 &= -897;
                } else {
                    strStringResource2 = str4;
                }
                if ((i2 & 8) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MoneyMovementPaymentPreferenceCellDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellKt$MoneyMovementPaymentPreferenceCell$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellKt$MoneyMovementPaymentPreferenceCell$$inlined$duxo$1.1
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
                    i4 = i3 & (-7169);
                    moneyMovementPaymentPreferenceCellDuxo3 = (MoneyMovementPaymentPreferenceCellDuxo) baseDuxo;
                } else {
                    composer2 = composerStartRestartGroup;
                    i4 = i3;
                    moneyMovementPaymentPreferenceCellDuxo3 = moneyMovementPaymentPreferenceCellDuxo2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                modifier3 = modifier2;
                i4 = i3;
                strStringResource = str3;
                strStringResource2 = str4;
                moneyMovementPaymentPreferenceCellDuxo3 = moneyMovementPaymentPreferenceCellDuxo2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2082679348, i4, -1, "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCell (MoneyMovementPaymentPreferenceCell.kt:34)");
            }
            Composer composer4 = composer2;
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(moneyMovementPaymentPreferenceCellDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifier3);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer4.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor);
            } else {
                composer4.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i9 = BentoTheme.$stable;
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer4, i9).getDisplayCapsuleSmall();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            String str7 = strStringResource;
            Modifier modifier5 = modifier3;
            BentoText2.m20747BentoText38GnDrw(str7, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer4, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composer4, (i4 >> 3) & 14, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i9).m21593getSmallD9Ej5fM()), composer4, 0);
            composer4.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer4.changedInstance(moneyMovementPaymentPreferenceCellDuxo3);
            Object objRememberedValue2 = composer4.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoneyMovementPaymentPreferenceCell.MoneyMovementPaymentPreferenceCell$lambda$2$lambda$1$lambda$0(moneyMovementPaymentPreferenceCellDuxo3);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue2);
            }
            composer4.endReplaceGroup();
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue2, 7, null), null, null, ComposableLambda3.rememberComposableLambda(-545592001, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellKt$MoneyMovementPaymentPreferenceCell$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i10) {
                    if ((i10 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-545592001, i10, -1, "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCell.<anonymous>.<anonymous> (MoneyMovementPaymentPreferenceCell.kt:50)");
                    }
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16382);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer4, 54), ComposableLambda3.rememberComposableLambda(1283614336, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellKt$MoneyMovementPaymentPreferenceCell$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i10) {
                    if ((i10 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1283614336, i10, -1, "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCell.<anonymous>.<anonymous> (MoneyMovementPaymentPreferenceCell.kt:55)");
                    }
                    String preferredPaymentMethodName = snapshotState4CollectAsStateWithLifecycle.getValue().getPreferredPaymentMethodName();
                    composer5.startReplaceGroup(897766036);
                    if (snapshotState4CollectAsStateWithLifecycle.getValue().getShowUnexpectedState()) {
                        preferredPaymentMethodName = StringResources_androidKt.stringResource(C22205R.string.unknown_payment_preference, composer5, 0);
                    }
                    composer5.endReplaceGroup();
                    if (preferredPaymentMethodName != null) {
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(preferredPaymentMethodName, null, Color.m6701boximpl(bentoTheme2.getColors(composer5, i11).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer5, i11).getTextM(), composer5, 0, 0, 8186);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer4, 54), null, ComposableLambda3.rememberComposableLambda(647059714, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellKt$MoneyMovementPaymentPreferenceCell$1$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i10) {
                    if ((i10 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(647059714, i10, -1, "com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCell.<anonymous>.<anonymous> (MoneyMovementPaymentPreferenceCell.kt:68)");
                    }
                    SnapshotState4<MoneyMovementPaymentPreferenceViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo5 = moneyMovementPaymentPreferenceCellDuxo3;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer5, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, companion3);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer5.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor2);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composer5.startReplaceGroup(1136810072);
                    if (snapshotState4.getValue().getShowUnexpectedState()) {
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.ALERT_24);
                        String strStringResource3 = StringResources_androidKt.stringResource(C22205R.string.alert_content_description, composer5, 0);
                        long jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21426getFg20d7_KjU();
                        composer5.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer5.changedInstance(moneyMovementPaymentPreferenceCellDuxo5);
                        Object objRememberedValue3 = composer5.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new MoneyMovementPaymentPreferenceCell5(moneyMovementPaymentPreferenceCellDuxo5);
                            composer5.updateRememberedValue(objRememberedValue3);
                        }
                        composer5.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource3, jM21426getFg20d7_KjU, null, (Function0) ((KFunction) objRememberedValue3), false, composer5, BentoIcon4.Size24.$stable, 40);
                    }
                    composer5.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.CARET_RIGHT_24), StringResources_androidKt.stringResource(C22205R.string.caret_content_description, composer5, 0), BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21426getFg20d7_KjU(), null, null, false, composer5, BentoIcon4.Size24.$stable, 56);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer4, 54), false, false, false, null, composer4, 1600512, 0, 1958);
            composer3 = composer4;
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            String str8 = strStringResource2;
            moneyMovementPaymentPreferenceCellDuxo4 = moneyMovementPaymentPreferenceCellDuxo3;
            str5 = str8;
            modifier4 = modifier5;
            str6 = str7;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.moneymovement.checkoutflow.MoneyMovementPaymentPreferenceCellKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MoneyMovementPaymentPreferenceCell.MoneyMovementPaymentPreferenceCell$lambda$3(modifier4, str6, str5, moneyMovementPaymentPreferenceCellDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoneyMovementPaymentPreferenceCell$lambda$2$lambda$1$lambda$0(MoneyMovementPaymentPreferenceCellDuxo moneyMovementPaymentPreferenceCellDuxo) {
        moneyMovementPaymentPreferenceCellDuxo.cellSelected();
        return Unit.INSTANCE;
    }
}
