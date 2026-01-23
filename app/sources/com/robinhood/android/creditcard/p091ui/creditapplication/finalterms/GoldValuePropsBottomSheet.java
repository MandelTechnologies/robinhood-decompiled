package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.view.ComponentActivity;
import androidx.view.compose.LocalActivity;
import coil.compose.SingletonAsyncImagePainter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.GoldValuePropsBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.bonfire.ApiGoldValueProp;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldValuePropsBottomSheet.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0001R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/GoldValuePropsBottomSheet;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GoldValuePropsBottomSheet extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(GoldValuePropsBottomSheet goldValuePropsBottomSheet, int i, Composer composer, int i2) {
        goldValuePropsBottomSheet.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        BottomSheetBehavior<FrameLayout> behavior;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog == null || (behavior = bottomSheetDialog.getBehavior()) == null) {
            return;
        }
        behavior.setDraggable(false);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1775311898);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1775311898, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet.ComposeContent (GoldValuePropsBottomSheet.kt:65)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            final ComponentActivity componentActivity = objConsume instanceof ComponentActivity ? (ComponentActivity) objConsume : null;
            final long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(481058258, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(481058258, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet.ComposeContent.<anonymous> (GoldValuePropsBottomSheet.kt:70)");
                    }
                    Unit unit = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(componentActivity) | composer2.changed(jM21371getBg0d7_KjU);
                    ComponentActivity componentActivity2 = componentActivity;
                    long j = jM21371getBg0d7_KjU;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new GoldValuePropsBottomSheet4(componentActivity2, j, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 6);
                    long jM21371getBg0d7_KjU2 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final EventLogger eventLogger = current;
                    final GoldValuePropsBottomSheet goldValuePropsBottomSheet = this;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(381054358, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet.ComposeContent.1.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(381054358, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet.ComposeContent.<anonymous>.<anonymous> (GoldValuePropsBottomSheet.kt:81)");
                            }
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(GoldValuePropsBottomSheet2.INSTANCE.getLambda$101051075$feature_credit_card_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1142777623, true, new AnonymousClass1(eventLogger, goldValuePropsBottomSheet), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: GoldValuePropsBottomSheet.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet$ComposeContent$1$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ GoldValuePropsBottomSheet this$0;

                            AnonymousClass1(EventLogger eventLogger, GoldValuePropsBottomSheet goldValuePropsBottomSheet) {
                                this.$eventLogger = eventLogger;
                                this.this$0 = goldValuePropsBottomSheet;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                                invoke(bentoAppBarScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i & 6) == 0) {
                                    i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1142777623, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet.ComposeContent.<anonymous>.<anonymous>.<anonymous> (GoldValuePropsBottomSheet.kt:84)");
                                }
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.this$0);
                                final EventLogger eventLogger = this.$eventLogger;
                                final GoldValuePropsBottomSheet goldValuePropsBottomSheet = this.this$0;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet$ComposeContent$1$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return GoldValuePropsBottomSheet.C123531.AnonymousClass2.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, goldValuePropsBottomSheet);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, GoldValuePropsBottomSheet goldValuePropsBottomSheet) {
                                loggingUtils.logDismiss(eventLogger, new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null));
                                goldValuePropsBottomSheet.dismiss();
                                return Unit.INSTANCE;
                            }
                        }
                    }, composer2, 54);
                    final GoldValuePropsBottomSheet goldValuePropsBottomSheet2 = this;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU2, 0L, null, ComposableLambda3.rememberComposableLambda(720351905, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet.ComposeContent.1.3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            int i5 = (i4 & 6) == 0 ? i4 | (composer3.changed(paddingValues) ? 4 : 2) : i4;
                            if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(720351905, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet.ComposeContent.<anonymous>.<anonymous> (GoldValuePropsBottomSheet.kt:94)");
                            }
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), paddingValues);
                            GoldValuePropsBottomSheet goldValuePropsBottomSheet3 = goldValuePropsBottomSheet2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Companion companion3 = GoldValuePropsBottomSheet.INSTANCE;
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(((Args) companion3.getArgs((Fragment) goldValuePropsBottomSheet3)).getGoldValueProps().getImagePath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer3, 0, 62), (String) null, SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(150)), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                            String title = ((Args) companion3.getArgs((Fragment) goldValuePropsBottomSheet3)).getGoldValueProps().getTitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i6).m21591getLargeD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getDisplayCapsuleLarge(), composer3, 0, 0, 8124);
                            composer3.startReplaceGroup(1749468595);
                            for (ApiGoldValueProp apiGoldValueProp : ((Args) companion3.getArgs((Fragment) goldValuePropsBottomSheet3)).getGoldValueProps().getValueProps()) {
                                BentoValuePropRow3.BentoValuePropRow(apiGoldValueProp.getTitle(), apiGoldValueProp.getContent(), new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null), BentoValuePropRow.Top, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, (BentoValuePropRow2.Icon.$stable << 6) | 27648, 0);
                            }
                            composer3.endReplaceGroup();
                            Alignment.Horizontal start = Alignment.INSTANCE.getStart();
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1);
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme2.getSpacing(composer3, i7).m21596getXxlargeD9Ej5fM(), 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), start, composer3, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            BentoMarkdownText2.BentoMarkdownText(((Args) GoldValuePropsBottomSheet.INSTANCE.getArgs((Fragment) goldValuePropsBottomSheet3)).getGoldValueProps().getDisclosureMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer3, i7).getTextS(), 0, bentoTheme2.getColors(composer3, i7).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer3, i7).m21426getFg20d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 445);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldValuePropsBottomSheet$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldValuePropsBottomSheet.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldValuePropsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/GoldValuePropsBottomSheet$Args;", "Landroid/os/Parcelable;", "goldValueProps", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;)V", "getGoldValueProps", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldValueProps;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiGoldUpgradeFlow.ApiGoldValueProps goldValueProps;

        /* compiled from: GoldValuePropsBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiGoldUpgradeFlow.ApiGoldValueProps) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiGoldUpgradeFlow.ApiGoldValueProps apiGoldValueProps, int i, Object obj) {
            if ((i & 1) != 0) {
                apiGoldValueProps = args.goldValueProps;
            }
            return args.copy(apiGoldValueProps);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiGoldUpgradeFlow.ApiGoldValueProps getGoldValueProps() {
            return this.goldValueProps;
        }

        public final Args copy(ApiGoldUpgradeFlow.ApiGoldValueProps goldValueProps) {
            Intrinsics.checkNotNullParameter(goldValueProps, "goldValueProps");
            return new Args(goldValueProps);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.goldValueProps, ((Args) other).goldValueProps);
        }

        public int hashCode() {
            return this.goldValueProps.hashCode();
        }

        public String toString() {
            return "Args(goldValueProps=" + this.goldValueProps + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.goldValueProps, flags);
        }

        public Args(ApiGoldUpgradeFlow.ApiGoldValueProps goldValueProps) {
            Intrinsics.checkNotNullParameter(goldValueProps, "goldValueProps");
            this.goldValueProps = goldValueProps;
        }

        public final ApiGoldUpgradeFlow.ApiGoldValueProps getGoldValueProps() {
            return this.goldValueProps;
        }
    }

    /* compiled from: GoldValuePropsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/GoldValuePropsBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/GoldValuePropsBottomSheet;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/GoldValuePropsBottomSheet$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldValuePropsBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldValuePropsBottomSheet goldValuePropsBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldValuePropsBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldValuePropsBottomSheet newInstance(Args args) {
            return (GoldValuePropsBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldValuePropsBottomSheet goldValuePropsBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldValuePropsBottomSheet, args);
        }
    }
}
