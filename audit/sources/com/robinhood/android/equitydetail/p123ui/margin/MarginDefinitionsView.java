package com.robinhood.android.equitydetail.p123ui.margin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.lifecycle.ViewModelStoreOwner;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.MarginDefinitionsViewData;
import com.robinhood.android.margin.contracts.BuyingPowerHubIntentKey;
import com.robinhood.android.margin.contracts.BuyingPowerHubIntentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.MarginRequirements;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.p409ui.view.Bindable;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginDefinitionsView.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001>B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0002H\u0016J\r\u0010<\u001a\u00020:H\u0017¢\u0006\u0002\u0010=R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010(0'X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010+\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010%\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00101\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010%\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R+\u00105\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010%\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/margin/MarginDefinitionsView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/equitydetail/ui/MarginDefinitionsViewData;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "accountNumber", "", "<set-?>", "symbol", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "symbol$delegate", "Landroidx/compose/runtime/MutableState;", "fields", "Landroidx/compose/runtime/MutableState;", "", "Lcom/robinhood/models/db/MarginRequirements$MarginFieldWithDefinition;", "", "showMarginHub", "getShowMarginHub", "()Z", "setShowMarginHub", "(Z)V", "showMarginHub$delegate", "showHighRiskIndicator", "getShowHighRiskIndicator", "setShowHighRiskIndicator", "showHighRiskIndicator$delegate", "showRatioBanner", "getShowRatioBanner", "setShowRatioBanner", "showRatioBanner$delegate", "bind", "", "state", "SdpContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarginDefinitionsView extends Hammer_MarginDefinitionsView implements Bindable<MarginDefinitionsViewData> {
    public static final float EXTRA_LINE_MULTIPLIER = 1.0f;
    public static final float EXTRA_LINE_SPACING = 4.0f;
    public static final String MAINTENANCE_RATIO_ID = "maintenance-ratio";
    public static final int META_ELEMENT_MAX_LINES = 1;
    public static final int PRIMARY_ELEMENT_MAX_LINES = 2;
    private String accountNumber;
    private final SnapshotState<List<MarginRequirements.MarginFieldWithDefinition>> fields;
    public Markwon markwon;
    public Navigator navigator;

    /* renamed from: showHighRiskIndicator$delegate, reason: from kotlin metadata */
    private final SnapshotState showHighRiskIndicator;

    /* renamed from: showMarginHub$delegate, reason: from kotlin metadata */
    private final SnapshotState showMarginHub;

    /* renamed from: showRatioBanner$delegate, reason: from kotlin metadata */
    private final SnapshotState showRatioBanner;

    /* renamed from: symbol$delegate, reason: from kotlin metadata */
    private final SnapshotState symbol;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float MARGIN_ROW_MIN_HEIGHT = C2002Dp.m7995constructorimpl(48);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(MarginDefinitionsView marginDefinitionsView, int i, Composer composer, int i2) {
        marginDefinitionsView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$9(MarginDefinitionsView marginDefinitionsView, int i, Composer composer, int i2) {
        marginDefinitionsView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ MarginDefinitionsView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginDefinitionsView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.symbol = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.fields = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.showMarginHub = SnapshotState3.mutableStateOf$default(bool, null, 2, null);
        this.showHighRiskIndicator = SnapshotState3.mutableStateOf$default(bool, null, 2, null);
        this.showRatioBanner = SnapshotState3.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        return new Component(Component.ComponentType.MARGIN_REQUIREMENT_SECTION, null, null, 6, null);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getSymbol() {
        return (String) this.symbol.getValue();
    }

    private final void setSymbol(String str) {
        this.symbol.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowMarginHub() {
        return ((Boolean) this.showMarginHub.getValue()).booleanValue();
    }

    private final void setShowMarginHub(boolean z) {
        this.showMarginHub.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowHighRiskIndicator() {
        return ((Boolean) this.showHighRiskIndicator.getValue()).booleanValue();
    }

    private final void setShowHighRiskIndicator(boolean z) {
        this.showHighRiskIndicator.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowRatioBanner() {
        return ((Boolean) this.showRatioBanner.getValue()).booleanValue();
    }

    private final void setShowRatioBanner(boolean z) {
        this.showRatioBanner.setValue(Boolean.valueOf(z));
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(MarginDefinitionsViewData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.accountNumber = state.getAccountNumber();
        setSymbol(state.getSymbol());
        this.fields.setValue(state.getFields());
        setShowMarginHub(state.getShowMarginHub());
        setShowHighRiskIndicator(state.getShowHighRiskIndicator());
        setShowRatioBanner(state.getShowRatioBanner());
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        List<MarginRequirements.MarginFieldWithDefinition> list;
        ?? r0;
        float f;
        Object obj;
        Modifier modifier;
        String symbol;
        final MarginDefinitionsView marginDefinitionsView = this;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1129107306);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(marginDefinitionsView) ? 4 : 2) | i : i;
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1129107306, i2, -1, "com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView.SdpContent (MarginDefinitionsView.kt:86)");
            }
            List<MarginRequirements.MarginFieldWithDefinition> value = marginDefinitionsView.fields.getValue();
            if (value == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return MarginDefinitionsView.SdpContent$lambda$0(this.f$0, i, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-76691950);
            if (!marginDefinitionsView.getShowRatioBanner() || (symbol = marginDefinitionsView.getSymbol()) == null) {
                list = value;
                r0 = 1;
                f = 0.0f;
                obj = null;
            } else {
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, null, null, null, new Component(null, "sdp-maintenance-ratio-banner", null, 5, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), BentoBaseRowLayout8.INSTANCE.m21050getPaddingHorizontalD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21597getXxsmallD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM())), bentoTheme.getColors(composerStartRestartGroup, i3).m21372getBg20d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                list = value;
                obj = null;
                f = 0.0f;
                r0 = 1;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15314R.string.margin_ratio_increase_banner, new Object[]{symbol}, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-76641371);
            for (final MarginRequirements.MarginFieldWithDefinition marginFieldWithDefinition : list) {
                final boolean zAreEqual = Intrinsics.areEqual(marginFieldWithDefinition.getId(), MAINTENANCE_RATIO_ID);
                Modifier modifierAutoLogEvents$default = Modifier.INSTANCE;
                Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifierAutoLogEvents$default, f, MARGIN_ROW_MIN_HEIGHT, r0, obj);
                if (getShowHighRiskIndicator()) {
                    modifier = modifierAutoLogEvents$default;
                    modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier, new UserInteractionEventDescriptor(null, null, null, null, new Component(null, "sdp-" + marginFieldWithDefinition.getId() + "-item", null, 5, null), null, 47, null), true, false, false, true, false, null, 108, null);
                } else {
                    modifier = modifierAutoLogEvents$default;
                }
                Modifier modifierThen = modifierM5155defaultMinSizeVpY3zN4$default.then(modifierAutoLogEvents$default);
                float fM21050getPaddingHorizontalD9Ej5fM = BentoBaseRowLayout8.INSTANCE.m21050getPaddingHorizontalD9Ej5fM();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m5143paddingVpY3zN4(modifierThen, fM21050getPaddingHorizontalD9Ej5fM, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), null, null, ComposableLambda3.rememberComposableLambda(-1954119497, r0, new MarginDefinitionsView2(marginFieldWithDefinition), composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-861334215, r0, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView$SdpContent$1$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        long jM21425getFg0d7_KjU;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-861334215, i5, -1, "com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView.SdpContent.<anonymous>.<anonymous>.<anonymous> (MarginDefinitionsView.kt:178)");
                        }
                        String value2 = marginFieldWithDefinition.getValue();
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        TextStyle textM = bentoTheme3.getTypography(composer2, i6).getTextM();
                        if (this.getShowHighRiskIndicator() && zAreEqual) {
                            composer2.startReplaceGroup(-1872736942);
                            jM21425getFg0d7_KjU = bentoTheme3.getColors(composer2, i6).getJoule();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1872644779);
                            jM21425getFg0d7_KjU = bentoTheme3.getColors(composer2, i6).m21425getFg0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(value2, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, (this.getShowHighRiskIndicator() && zAreEqual) ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 1, 0, null, 0, textM, composer2, 805306368, 0, 7658);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, true, true, null, composerStartRestartGroup, 918752256, 0, 1110);
                Divider2.m5581DivideroMI9zvI(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier, f, r0, obj), bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), f, 2, obj), bentoTheme2.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl((float) r0), 0.0f, composerStartRestartGroup, 384, 8);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-76511129);
            if (getShowMarginHub()) {
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(SizeKt.m5155defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, f, MARGIN_ROW_MIN_HEIGHT, r0, obj), BentoBaseRowLayout8.INSTANCE.m21050getPaddingHorizontalD9Ej5fM(), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                marginDefinitionsView = this;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(marginDefinitionsView);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginDefinitionsView.SdpContent$lambda$8$lambda$7$lambda$6$lambda$5(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, StringResources_androidKt.stringResource(C15314R.string.view_margin_status, composerStartRestartGroup, 0), null, null, null, false, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                composerStartRestartGroup.endNode();
            } else {
                marginDefinitionsView = this;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MarginDefinitionsView.SdpContent$lambda$9(this.f$0, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$8$lambda$7$lambda$6$lambda$5(MarginDefinitionsView marginDefinitionsView) {
        Navigator navigator = marginDefinitionsView.getNavigator();
        Context context = marginDefinitionsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new BuyingPowerHubIntentKey(marginDefinitionsView.accountNumber, "sdp", BuyingPowerHubIntentKey2.MARGIN_STATUS), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: MarginDefinitionsView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u00020\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/margin/MarginDefinitionsView$Companion;", "", "<init>", "()V", "META_ELEMENT_MAX_LINES", "", "PRIMARY_ELEMENT_MAX_LINES", "EXTRA_LINE_SPACING", "", "EXTRA_LINE_MULTIPLIER", "MAINTENANCE_RATIO_ID", "", "MARGIN_ROW_MIN_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "getMARGIN_ROW_MIN_HEIGHT-D9Ej5fM", "()F", "F", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getMARGIN_ROW_MIN_HEIGHT-D9Ej5fM, reason: not valid java name */
        public final float m13900getMARGIN_ROW_MIN_HEIGHTD9Ej5fM() {
            return MarginDefinitionsView.MARGIN_ROW_MIN_HEIGHT;
        }
    }
}
