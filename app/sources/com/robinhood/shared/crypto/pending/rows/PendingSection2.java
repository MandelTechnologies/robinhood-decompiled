package com.robinhood.shared.crypto.pending.rows;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.pending.rows.PendingData;
import com.robinhood.shared.crypto.pending.rows.PendingSection2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PendingSection.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u001ap\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a-\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0018\"\u001c\u0010\u0019\u001a\u00020\u001a8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u001c\u0010\u001f\u001a\u00020\u001a8\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006\""}, m3636d2 = {"PendingSection", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "pendingOrders", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/pending/rows/PendingData;", "isShowMoreVisible", "", "onPendingOrderClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "pendingData", "onShowAllClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "loggingData", "Lcom/robinhood/shared/crypto/pending/rows/PendingLoggingData;", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/pending/rows/PendingLoggingData;Landroidx/compose/runtime/Composer;II)V", "PendingOrderRow", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onClick", "(Lcom/robinhood/shared/crypto/pending/rows/PendingData;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PENDING_ORDERS_SECTION_TAG", "", "getPENDING_ORDERS_SECTION_TAG$annotations", "()V", "getPENDING_ORDERS_SECTION_TAG", "()Ljava/lang/String;", "PENDING_ORDERS_SHOW_MORE_TAG", "getPENDING_ORDERS_SHOW_MORE_TAG$annotations", "getPENDING_ORDERS_SHOW_MORE_TAG", "lib-pending-rows_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.pending.rows.PendingSectionKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PendingSection2 {
    private static final String PENDING_ORDERS_SECTION_TAG = "pending_orders_section_tag";
    private static final String PENDING_ORDERS_SHOW_MORE_TAG = "pending_orders_show_more_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingOrderRow$lambda$1(PendingData pendingData, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PendingOrderRow(pendingData, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingSection$lambda$0(StringResource stringResource, ImmutableList immutableList, boolean z, Function1 function1, Function0 function0, Modifier modifier, PendingLoggingData pendingLoggingData, int i, int i2, Composer composer, int i3) {
        PendingSection(stringResource, immutableList, z, function1, function0, modifier, pendingLoggingData, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPENDING_ORDERS_SECTION_TAG$annotations() {
    }

    public static /* synthetic */ void getPENDING_ORDERS_SHOW_MORE_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PendingSection(final StringResource title, final ImmutableList<PendingData> pendingOrders, final boolean z, final Function1<? super PendingData, Unit> onPendingOrderClick, final Function0<Unit> onShowAllClick, Modifier modifier, PendingLoggingData pendingLoggingData, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        PendingLoggingData pendingLoggingData2;
        PendingLoggingData pendingLoggingData3;
        Modifier modifier3;
        int i5;
        final PendingLoggingData pendingLoggingData4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pendingOrders, "pendingOrders");
        Intrinsics.checkNotNullParameter(onPendingOrderClick, "onPendingOrderClick");
        Intrinsics.checkNotNullParameter(onShowAllClick, "onShowAllClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1731331540);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(title) : composerStartRestartGroup.changedInstance(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(pendingOrders) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onPendingOrderClick) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onShowAllClick) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        pendingLoggingData2 = pendingLoggingData;
                        int i6 = composerStartRestartGroup.changedInstance(pendingLoggingData2) ? 1048576 : 524288;
                        i3 |= i6;
                    } else {
                        pendingLoggingData2 = pendingLoggingData;
                    }
                    i3 |= i6;
                } else {
                    pendingLoggingData2 = pendingLoggingData;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 64) == 0) {
                            i3 &= -3670017;
                            modifier3 = modifier5;
                            pendingLoggingData3 = new PendingLoggingData(null, null, 3, null);
                        } else {
                            pendingLoggingData3 = pendingLoggingData2;
                            modifier3 = modifier5;
                        }
                        i5 = i3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        i5 = i3;
                        pendingLoggingData3 = pendingLoggingData2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1731331540, i5, -1, "com.robinhood.shared.crypto.pending.rows.PendingSection (PendingSection.kt:39)");
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(!pendingOrders.isEmpty(), modifier3, EnterExitTransitionKt.expandVertically$default(null, Alignment.INSTANCE.getTop(), false, null, 13, null), ExitTransition.INSTANCE.getNone(), (String) null, ComposableLambda3.rememberComposableLambda(-1737692588, true, new C377441(title, pendingOrders, z, pendingLoggingData3, onShowAllClick, onPendingOrderClick), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 12) & 112) | 196992, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    pendingLoggingData4 = pendingLoggingData3;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    pendingLoggingData4 = pendingLoggingData2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PendingSection2.PendingSection$lambda$0(title, pendingOrders, z, onPendingOrderClick, onShowAllClick, modifier4, pendingLoggingData4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i3) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i4 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    i5 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    AnimatedVisibilityKt.AnimatedVisibility(!pendingOrders.isEmpty(), modifier3, EnterExitTransitionKt.expandVertically$default(null, Alignment.INSTANCE.getTop(), false, null, 13, null), ExitTransition.INSTANCE.getNone(), (String) null, ComposableLambda3.rememberComposableLambda(-1737692588, true, new C377441(title, pendingOrders, z, pendingLoggingData3, onShowAllClick, onPendingOrderClick), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 12) & 112) | 196992, 16);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    pendingLoggingData4 = pendingLoggingData3;
                    modifier4 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: PendingSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.pending.rows.PendingSectionKt$PendingSection$1 */
    static final class C377441 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ boolean $isShowMoreVisible;
        final /* synthetic */ PendingLoggingData $loggingData;
        final /* synthetic */ Function1<PendingData, Unit> $onPendingOrderClick;
        final /* synthetic */ Function0<Unit> $onShowAllClick;
        final /* synthetic */ ImmutableList<PendingData> $pendingOrders;
        final /* synthetic */ StringResource $title;

        /* JADX WARN: Multi-variable type inference failed */
        C377441(StringResource stringResource, ImmutableList<PendingData> immutableList, boolean z, PendingLoggingData pendingLoggingData, Function0<Unit> function0, Function1<? super PendingData, Unit> function1) {
            this.$title = stringResource;
            this.$pendingOrders = immutableList;
            this.$isShowMoreVisible = z;
            this.$loggingData = pendingLoggingData;
            this.$onShowAllClick = function0;
            this.$onPendingOrderClick = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Modifier modifierAutoLogEvents$default;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1737692588, i, -1, "com.robinhood.shared.crypto.pending.rows.PendingSection.<anonymous> (PendingSection.kt:46)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(AnimationModifier.animateContentSize$default(companion, null, null, 3, null), PendingSection2.getPENDING_ORDERS_SECTION_TAG());
            StringResource stringResource = this.$title;
            ImmutableList<PendingData> immutableList = this.$pendingOrders;
            boolean z = this.$isShowMoreVisible;
            PendingLoggingData pendingLoggingData = this.$loggingData;
            Function0<Unit> function0 = this.$onShowAllClick;
            Function1<PendingData, Unit> function1 = this.$onPendingOrderClick;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
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
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Function1<PendingData, Unit> function12 = function1;
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(stringResource, composer, StringResource.$stable), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            composer.startReplaceGroup(-995789013);
            for (final PendingData pendingData : immutableList) {
                if (pendingLoggingData.getOrderRowEventDescriptor() != null) {
                    modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, pendingLoggingData.getOrderRowEventDescriptor(), true, false, false, true, false, null, 108, null);
                } else {
                    modifierAutoLogEvents$default = Modifier.INSTANCE;
                }
                Modifier modifier = modifierAutoLogEvents$default;
                composer.startReplaceGroup(-1633490746);
                final Function1<PendingData, Unit> function13 = function12;
                boolean zChanged = composer.changed(function13) | composer.changedInstance(pendingData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt$PendingSection$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PendingSection2.C377441.invoke$lambda$4$lambda$2$lambda$1$lambda$0(function13, pendingData);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PendingSection2.PendingOrderRow(pendingData, (Function0) objRememberedValue, modifier, composer, 0, 0);
                function12 = function13;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-995769459);
            if (z) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer, 6, 1);
                if (pendingLoggingData.getShowAllCtaEventDescriptor() != null) {
                    modifierM21623defaultHorizontalPaddingrAjV9yQ = ModifiersKt.autoLogEvents$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, pendingLoggingData.getShowAllCtaEventDescriptor(), true, false, false, true, false, null, 108, null);
                }
                BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C37745R.string.pending_orders_show_more_cta, composer, 0), TestTag3.testTag(modifierM21623defaultHorizontalPaddingrAjV9yQ, PendingSection2.getPENDING_ORDERS_SHOW_MORE_TAG()), null, null, false, Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21368getAccent0d7_KjU()), composer, 0, 56);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$2$lambda$1$lambda$0(Function1 function1, PendingData pendingData) {
            function1.invoke(pendingData);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PendingOrderRow(final PendingData pendingData, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(643214962);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pendingData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(643214962, i3, -1, "com.robinhood.shared.crypto.pending.rows.PendingOrderRow (PendingSection.kt:99)");
                }
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, function02, 7, null), null, null, ComposableLambda3.rememberComposableLambda(-31843409, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt.PendingOrderRow.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-31843409, i5, -1, "com.robinhood.shared.crypto.pending.rows.PendingOrderRow.<anonymous> (PendingSection.kt:103)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(pendingData.getStartPrimaryText(), composer3, StringResource.$stable), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, null, composer3, 817889280, 0, 15742);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(161087792, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt.PendingOrderRow.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(161087792, i5, -1, "com.robinhood.shared.crypto.pending.rows.PendingOrderRow.<anonymous> (PendingSection.kt:110)");
                        }
                        StringResource startSecondaryText = pendingData.getStartSecondaryText();
                        if (startSecondaryText != null) {
                            String string2 = StringResource2.getString(startSecondaryText, composer3, StringResource.$stable);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            TextStyle textS = bentoTheme.getTypography(composer3, i6).getTextS();
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU();
                            BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textS, composer3, 817889280, 0, 7546);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(354018993, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt.PendingOrderRow.3

                    /* compiled from: PendingSection.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.shared.crypto.pending.rows.PendingSectionKt$PendingOrderRow$3$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[PendingData.Type.values().length];
                            try {
                                iArr[PendingData.Type.TRANSFER.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PendingData.Type.PERPETUAL_ORDER.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[PendingData.Type.ORDER.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    public final void invoke(Composer composer3, int i5) {
                        PendingData pendingData2;
                        long jM21426getFg20d7_KjU;
                        TextStyle textS;
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(354018993, i5, -1, "com.robinhood.shared.crypto.pending.rows.PendingOrderRow.<anonymous> (PendingSection.kt:121)");
                        }
                        Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                        PendingData pendingData3 = pendingData;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                        composer3.startReplaceGroup(1881823393);
                        if (pendingData3.getEndPrimaryText() != null) {
                            pendingData2 = pendingData3;
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(pendingData3.getEndPrimaryText(), composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        } else {
                            pendingData2 = pendingData3;
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1881828573);
                        if (pendingData2.getEndSecondaryText() != null) {
                            String string2 = StringResource2.getString(pendingData2.getEndSecondaryText(), composer3, StringResource.$stable);
                            PendingData.Type type2 = pendingData2.getType();
                            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                            int i6 = iArr[type2.ordinal()];
                            if (i6 == 1 || i6 == 2 || i6 == 3) {
                                composer3.startReplaceGroup(1881840746);
                                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1881842633);
                                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                                composer3.endReplaceGroup();
                            }
                            Color colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU);
                            int i7 = iArr[pendingData2.getType().ordinal()];
                            if (i7 == 2 || i7 == 3) {
                                composer3.startReplaceGroup(1881850700);
                                textS = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS();
                                composer3.endReplaceGroup();
                            } else {
                                composer3.startReplaceGroup(1881852780);
                                textS = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                                composer3.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(string2, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), null, false, false, false, null, composer2, 224256, 0, 1990);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PendingSection2.PendingOrderRow$lambda$1(pendingData, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier42 = modifier2;
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, function02, 7, null), null, null, ComposableLambda3.rememberComposableLambda(-31843409, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt.PendingOrderRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-31843409, i5, -1, "com.robinhood.shared.crypto.pending.rows.PendingOrderRow.<anonymous> (PendingSection.kt:103)");
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(pendingData.getStartPrimaryText(), composer3, StringResource.$stable), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, null, composer3, 817889280, 0, 15742);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(161087792, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt.PendingOrderRow.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(161087792, i5, -1, "com.robinhood.shared.crypto.pending.rows.PendingOrderRow.<anonymous> (PendingSection.kt:110)");
                    }
                    StringResource startSecondaryText = pendingData.getStartSecondaryText();
                    if (startSecondaryText != null) {
                        String string2 = StringResource2.getString(startSecondaryText, composer3, StringResource.$stable);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        TextStyle textS = bentoTheme.getTypography(composer3, i6).getTextS();
                        long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i6).m21426getFg20d7_KjU();
                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textS, composer3, 817889280, 0, 7546);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(354018993, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.pending.rows.PendingSectionKt.PendingOrderRow.3

                /* compiled from: PendingSection.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.crypto.pending.rows.PendingSectionKt$PendingOrderRow$3$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[PendingData.Type.values().length];
                        try {
                            iArr[PendingData.Type.TRANSFER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[PendingData.Type.PERPETUAL_ORDER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[PendingData.Type.ORDER.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public final void invoke(Composer composer3, int i5) {
                    PendingData pendingData2;
                    long jM21426getFg20d7_KjU;
                    TextStyle textS;
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(354018993, i5, -1, "com.robinhood.shared.crypto.pending.rows.PendingOrderRow.<anonymous> (PendingSection.kt:121)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    PendingData pendingData3 = pendingData;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
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
                    composer3.startReplaceGroup(1881823393);
                    if (pendingData3.getEndPrimaryText() != null) {
                        pendingData2 = pendingData3;
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(pendingData3.getEndPrimaryText(), composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    } else {
                        pendingData2 = pendingData3;
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1881828573);
                    if (pendingData2.getEndSecondaryText() != null) {
                        String string2 = StringResource2.getString(pendingData2.getEndSecondaryText(), composer3, StringResource.$stable);
                        PendingData.Type type2 = pendingData2.getType();
                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                        int i6 = iArr[type2.ordinal()];
                        if (i6 == 1 || i6 == 2 || i6 == 3) {
                            composer3.startReplaceGroup(1881840746);
                            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21426getFg20d7_KjU();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1881842633);
                            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                            composer3.endReplaceGroup();
                        }
                        Color colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU);
                        int i7 = iArr[pendingData2.getType().ordinal()];
                        if (i7 == 2 || i7 == 3) {
                            composer3.startReplaceGroup(1881850700);
                            textS = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextS();
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1881852780);
                            textS = BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM();
                            composer3.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(string2, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), null, false, false, false, null, composer2, 224256, 0, 1990);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final String getPENDING_ORDERS_SECTION_TAG() {
        return PENDING_ORDERS_SECTION_TAG;
    }

    public static final String getPENDING_ORDERS_SHOW_MORE_TAG() {
        return PENDING_ORDERS_SHOW_MORE_TAG;
    }
}
