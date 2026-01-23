package com.robinhood.android.common.options.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OptionsMultilegBidAskView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u001f B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\r\u0010\u0015\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u00020\u0013*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010\u001eR/\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/options/views/OptionsMultilegBidAskView;", "Lcom/robinhood/compose/app/GenericComposeView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/common/options/views/OptionsMultilegBidAskView$State;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "uiState", "getUiState", "()Lcom/robinhood/android/common/options/views/OptionsMultilegBidAskView$State;", "setUiState", "(Lcom/robinhood/android/common/options/views/OptionsMultilegBidAskView$State;)V", "uiState$delegate", "Landroidx/compose/runtime/MutableState;", "bind", "", "state", "Content", "(Landroidx/compose/runtime/Composer;I)V", "InfoColumn", "Landroidx/compose/foundation/layout/RowScope;", AnnotatedPrivateKey.LABEL, "", "value", "contentAlignment", "Landroidx/compose/ui/Alignment;", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/runtime/Composer;I)V", "State", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionsMultilegBidAskView extends GenericComposeView implements Bindable<State> {

    /* renamed from: uiState$delegate, reason: from kotlin metadata */
    private final SnapshotState uiState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeView.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(OptionsMultilegBidAskView optionsMultilegBidAskView, int i, Composer composer, int i2) {
        optionsMultilegBidAskView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2(OptionsMultilegBidAskView optionsMultilegBidAskView, int i, Composer composer, int i2) {
        optionsMultilegBidAskView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoColumn$lambda$5(OptionsMultilegBidAskView optionsMultilegBidAskView, Row5 row5, String str, String str2, Alignment alignment, int i, Composer composer, int i2) {
        optionsMultilegBidAskView.InfoColumn(row5, str, str2, alignment, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ OptionsMultilegBidAskView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsMultilegBidAskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiState = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final State getUiState() {
        return (State) this.uiState.getValue();
    }

    private final void setUiState(State state) {
        this.uiState.setValue(state);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setUiState(state);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(574964548);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(574964548, i2, -1, "com.robinhood.android.common.options.views.OptionsMultilegBidAskView.Content (OptionsMultilegBidAskView.kt:44)");
            }
            State uiState = getUiState();
            if (uiState == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.options.views.OptionsMultilegBidAskView$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionsMultilegBidAskView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_limit_price, composerStartRestartGroup, 0);
            String limitPriceString = uiState.getLimitPriceString();
            Alignment topStart = companion.getTopStart();
            int i3 = GenericComposeView.$stable;
            int i4 = (i2 << 12) & 57344;
            InfoColumn(row6, strStringResource, limitPriceString, topStart, composerStartRestartGroup, (i3 << 12) | 3078 | i4);
            String strStringResource2 = StringResources_androidKt.stringResource(C11303R.string.option_detail_statistics_bid_label, composerStartRestartGroup, 0);
            String bidString = uiState.getBidString();
            composerStartRestartGroup.startReplaceGroup(1510724075);
            if (bidString == null) {
                bidString = StringResources_androidKt.stringResource(C11048R.string.general_label_n_a_short, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            InfoColumn(row6, strStringResource2, bidString, companion.getTopCenter(), composerStartRestartGroup, (i3 << 12) | 3078 | i4);
            String strStringResource3 = StringResources_androidKt.stringResource(C11303R.string.option_detail_statistics_ask_label, composerStartRestartGroup, 0);
            String askString = uiState.getAskString();
            composerStartRestartGroup.startReplaceGroup(1510733195);
            if (askString == null) {
                askString = StringResources_androidKt.stringResource(C11048R.string.general_label_n_a_short, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            InfoColumn(row6, strStringResource3, askString, companion.getTopEnd(), composerStartRestartGroup, (i3 << 12) | 3078 | i4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.common.options.views.OptionsMultilegBidAskView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsMultilegBidAskView.Content$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void InfoColumn(final Row5 row5, final String str, final String str2, final Alignment alignment, Composer composer, final int i) {
        Row5 row52;
        int i2;
        String str3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1060442860);
        if ((i & 6) == 0) {
            row52 = row5;
            i2 = (composerStartRestartGroup.changed(row52) ? 4 : 2) | i;
        } else {
            row52 = row5;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(alignment) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1060442860, i2, -1, "com.robinhood.android.common.options.views.OptionsMultilegBidAskView.InfoColumn (OptionsMultilegBidAskView.kt:75)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierWeight$default = Row5.weight$default(row52, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), 1.0f, false, 2, null);
            int i3 = i2 >> 6;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(companion, null, false, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentWidth$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU();
            TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(str3, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, textS, composer2, ((i2 >> 3) & 14) | 817889280, 0, 7546);
            BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, companion3.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, null, composer2, (i3 & 14) | 817913856, 0, 15722);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.options.views.OptionsMultilegBidAskView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsMultilegBidAskView.InfoColumn$lambda$5(this.f$0, row5, str, str2, alignment, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OptionsMultilegBidAskView.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/options/views/OptionsMultilegBidAskView$State;", "", "optionQuote", "Lcom/robinhood/models/db/OptionQuote;", "limitPrice", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/db/OptionQuote;Ljava/math/BigDecimal;)V", "getOptionQuote", "()Lcom/robinhood/models/db/OptionQuote;", "getLimitPrice", "()Ljava/math/BigDecimal;", "limitPriceString", "", "getLimitPriceString", "()Ljava/lang/String;", "bidString", "getBidString", "askString", "getAskString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final String askString;
        private final String bidString;
        private final BigDecimal limitPrice;
        private final String limitPriceString;
        private final OptionQuote optionQuote;

        public static /* synthetic */ State copy$default(State state, OptionQuote optionQuote, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                optionQuote = state.optionQuote;
            }
            if ((i & 2) != 0) {
                bigDecimal = state.limitPrice;
            }
            return state.copy(optionQuote, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionQuote getOptionQuote() {
            return this.optionQuote;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final State copy(OptionQuote optionQuote, BigDecimal limitPrice) {
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            return new State(optionQuote, limitPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.optionQuote, state.optionQuote) && Intrinsics.areEqual(this.limitPrice, state.limitPrice);
        }

        public int hashCode() {
            OptionQuote optionQuote = this.optionQuote;
            return ((optionQuote == null ? 0 : optionQuote.hashCode()) * 31) + this.limitPrice.hashCode();
        }

        public String toString() {
            return "State(optionQuote=" + this.optionQuote + ", limitPrice=" + this.limitPrice + ")";
        }

        public State(OptionQuote optionQuote, BigDecimal limitPrice) {
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            this.optionQuote = optionQuote;
            this.limitPrice = limitPrice;
            this.limitPriceString = Formats.getAmountFormat().format(limitPrice);
            this.bidString = optionQuote != null ? Formats.getAmountFormat().format(optionQuote.getBidPrice().getRawValue()) : null;
            this.askString = optionQuote != null ? Formats.getAmountFormat().format(optionQuote.getAskPrice().getRawValue()) : null;
        }

        public final OptionQuote getOptionQuote() {
            return this.optionQuote;
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final String getLimitPriceString() {
            return this.limitPriceString;
        }

        public final String getBidString() {
            return this.bidString;
        }

        public final String getAskString() {
            return this.askString;
        }
    }

    /* compiled from: OptionsMultilegBidAskView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/options/views/OptionsMultilegBidAskView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/options/views/OptionsMultilegBidAskView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionsMultilegBidAskView> {
        private final /* synthetic */ Inflater<OptionsMultilegBidAskView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionsMultilegBidAskView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionsMultilegBidAskView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11303R.layout.include_option_multileg_bid_ask_view);
        }
    }
}
