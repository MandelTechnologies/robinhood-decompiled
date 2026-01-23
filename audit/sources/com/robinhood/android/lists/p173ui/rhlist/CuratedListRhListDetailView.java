package com.robinhood.android.lists.p173ui.rhlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListDetailView;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState;
import com.robinhood.common.strings.C32428R;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.tooltips.popup.PopupPositioning;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CuratedListRhListDetailView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003%&'B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$Callbacks;)V", "itemsHeaderTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getItemsHeaderTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "itemsHeaderTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "itemsQuantityTxt", "getItemsQuantityTxt", "itemsQuantityTxt$delegate", "controlsBtn", "Lcom/robinhood/android/designsystem/button/RdsIconButton;", "getControlsBtn", "()Lcom/robinhood/android/designsystem/button/RdsIconButton;", "controlsBtn$delegate", "filterChipComposeView", "Landroidx/compose/ui/platform/ComposeView;", "getFilterChipComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "filterChipComposeView$delegate", "bind", "", "state", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State;", "Callbacks", "Companion", "State", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListRhListDetailView extends ConstraintLayout {
    private Callbacks callbacks;

    /* renamed from: controlsBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 controlsBtn;

    /* renamed from: filterChipComposeView$delegate, reason: from kotlin metadata */
    private final Interfaces2 filterChipComposeView;

    /* renamed from: itemsHeaderTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 itemsHeaderTxt;

    /* renamed from: itemsQuantityTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 itemsQuantityTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListRhListDetailView.class, "itemsHeaderTxt", "getItemsHeaderTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListRhListDetailView.class, "itemsQuantityTxt", "getItemsQuantityTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListRhListDetailView.class, "controlsBtn", "getControlsBtn()Lcom/robinhood/android/designsystem/button/RdsIconButton;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListRhListDetailView.class, "filterChipComposeView", "getFilterChipComposeView()Landroidx/compose/ui/platform/ComposeView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CuratedListRhListDetailView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$Callbacks;", "", "onSortControlButtonClicked", "", "currentSortOption", "Lcom/robinhood/models/ui/SortOption;", "isFuturesOnlyList", "", "onFilterChipClicked", "filterChip", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;", "onFilterChipTooltipClicked", "onFilterChipTooltipAppear", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onFilterChipClicked(CuratedListRhListViewState.Filter filterChip);

        void onFilterChipTooltipAppear(CuratedListRhListViewState.Filter filterChip);

        void onFilterChipTooltipClicked(CuratedListRhListViewState.Filter filterChip);

        void onSortControlButtonClicked(SortOption currentSortOption, boolean isFuturesOnlyList);
    }

    public /* synthetic */ CuratedListRhListDetailView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListRhListDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemsHeaderTxt = BindViewDelegate2.bindView$default(this, C20839R.id.rh_list_detail_header, null, 2, null);
        this.itemsQuantityTxt = BindViewDelegate2.bindView$default(this, C20839R.id.rh_list_detail_quantity, null, 2, null);
        this.controlsBtn = BindViewDelegate2.bindView$default(this, C20839R.id.rh_list_detail_control_btn, null, 2, null);
        this.filterChipComposeView = BindViewDelegate2.bindView$default(this, C20839R.id.rh_list_filter_chip_compose_view, null, 2, null);
        ViewGroups.inflate(this, C20839R.layout.merge_rh_list_detail_view, true);
        getFilterChipComposeView().setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    private final RhTextView getItemsHeaderTxt() {
        return (RhTextView) this.itemsHeaderTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getItemsQuantityTxt() {
        return (RhTextView) this.itemsQuantityTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final RdsIconButton getControlsBtn() {
        return (RdsIconButton) this.controlsBtn.getValue(this, $$delegatedProperties[2]);
    }

    private final ComposeView getFilterChipComposeView() {
        return (ComposeView) this.filterChipComposeView.getValue(this, $$delegatedProperties[3]);
    }

    public final void bind(State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final State.Data data = state.getData();
        final boolean zIsShowing = state.isShowing();
        int totalListItemCount = data.getTotalListItemCount();
        getItemsHeaderTxt().setVisibility(totalListItemCount > 0 ? 0 : 8);
        getItemsQuantityTxt().setVisibility(totalListItemCount > 0 ? 0 : 8);
        getItemsQuantityTxt().setText(getResources().getQuantityString(C32428R.plurals.lists_number_of_items, totalListItemCount, Integer.valueOf(totalListItemCount)));
        getControlsBtn().setVisibility(data.getShowRhControlsButton() ? 0 : 8);
        OnClickListeners.onClick(getControlsBtn(), new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListDetailView.bind$lambda$0(data, this);
            }
        });
        getFilterChipComposeView().setVisibility(data.getFilters() != null ? 0 : 8);
        final ImmutableList<CuratedListRhListViewState.Filter> filters = data.getFilters();
        if (filters != null) {
            getFilterChipComposeView().setContent(ComposableLambda3.composableLambdaInstance(-1608919362, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView$bind$2$1
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
                        ComposerKt.traceEventStart(-1608919362, i, -1, "com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView.bind.<anonymous>.<anonymous> (CuratedListRhListDetailView.kt:91)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1929477002, true, new C208681(filters, this, zIsShowing), composer, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CuratedListRhListDetailView.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView$bind$2$1$1 */
                static final class C208681 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ImmutableList<CuratedListRhListViewState.Filter> $filters;
                    final /* synthetic */ boolean $isShowing;
                    final /* synthetic */ CuratedListRhListDetailView this$0;

                    C208681(ImmutableList<CuratedListRhListViewState.Filter> immutableList, CuratedListRhListDetailView curatedListRhListDetailView, boolean z) {
                        this.$filters = immutableList;
                        this.this$0 = curatedListRhListDetailView;
                        this.$isShowing = z;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$7$lambda$6$lambda$5(CuratedListRhListDetailView curatedListRhListDetailView, CuratedListRhListViewState.Filter filter) {
                        CuratedListRhListDetailView.Callbacks callbacks = curatedListRhListDetailView.getCallbacks();
                        if (callbacks != null) {
                            callbacks.onFilterChipClicked(filter);
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$7$lambda$4$lambda$3$lambda$2(CuratedListRhListDetailView curatedListRhListDetailView, CuratedListRhListViewState.Filter filter) {
                        CuratedListRhListDetailView.Callbacks callbacks = curatedListRhListDetailView.getCallbacks();
                        if (callbacks != null) {
                            callbacks.onFilterChipTooltipAppear(filter);
                        }
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        Modifier modifierM26519popupTooltipBgaGok8;
                        Composer composer2 = composer;
                        if ((i & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1929477002, i, -1, "com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView.bind.<anonymous>.<anonymous>.<anonymous> (CuratedListRhListDetailView.kt:94)");
                        }
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM());
                        ImmutableList<CuratedListRhListViewState.Filter> immutableList = this.$filters;
                        final CuratedListRhListDetailView curatedListRhListDetailView = this.this$0;
                        boolean z = this.$isShowing;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        composer2.startReplaceGroup(292155576);
                        for (final CuratedListRhListViewState.Filter filter : immutableList) {
                            String strStringResource = StringResources_androidKt.stringResource(filter.getLabelRes(), composer2, 0);
                            boolean zIsSelected = filter.isSelected();
                            final String tooltipText = filter.getTooltipText();
                            composer2.startReplaceGroup(292166400);
                            if (tooltipText == null) {
                                modifierM26519popupTooltipBgaGok8 = null;
                            } else {
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                PopupPositioning popupPositioning = PopupPositioning.BELOW;
                                float fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
                                Boolean boolValueOf = Boolean.valueOf(z);
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer2.changedInstance(curatedListRhListDetailView) | composer2.changedInstance(filter);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011b: CONSTRUCTOR (r9v6 'objRememberedValue' java.lang.Object) = 
                                          (r10v0 'curatedListRhListDetailView' com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView A[DONT_INLINE])
                                          (r1v12 'filter' com.robinhood.android.lists.ui.rhlist.CuratedListRhListViewState$Filter A[DONT_INLINE])
                                         A[MD:(com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView, com.robinhood.android.lists.ui.rhlist.CuratedListRhListViewState$Filter):void (m)] (LINE:107) call: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView$bind$2$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView, com.robinhood.android.lists.ui.rhlist.CuratedListRhListViewState$Filter):void type: CONSTRUCTOR in method: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView$bind$2$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes8.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView$bind$2$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 37 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 461
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListDetailView2.C208681.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$8$lambda$7$lambda$4$lambda$1$lambda$0(CuratedListRhListDetailView curatedListRhListDetailView, CuratedListRhListViewState.Filter filter) {
                                    CuratedListRhListDetailView.Callbacks callbacks = curatedListRhListDetailView.getCallbacks();
                                    if (callbacks != null) {
                                        callbacks.onFilterChipTooltipClicked(filter);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }));
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit bind$lambda$0(State.Data data, CuratedListRhListDetailView curatedListRhListDetailView) {
                    Callbacks callbacks;
                    if (data.getCurrentSortOption() != null && (callbacks = curatedListRhListDetailView.callbacks) != null) {
                        callbacks.onSortControlButtonClicked(data.getCurrentSortOption(), data.isFuturesOnlyList());
                    }
                    return Unit.INSTANCE;
                }

                /* compiled from: CuratedListRhListDetailView.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Inflater<CuratedListRhListDetailView> {
                    private final /* synthetic */ Inflater<CuratedListRhListDetailView> $$delegate_0;

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    @Override // com.robinhood.utils.p409ui.view.Inflater
                    public CuratedListRhListDetailView inflate(ViewGroup parent) {
                        Intrinsics.checkNotNullParameter(parent, "parent");
                        return (CuratedListRhListDetailView) this.$$delegate_0.inflate(parent);
                    }

                    private Companion() {
                        this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_rh_list_detail_view);
                    }
                }

                /* compiled from: CuratedListRhListDetailView.kt */
                @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State$Data;", "isShowing", "", "<init>", "(Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State$Data;Z)V", "getData", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State$Data;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Data", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class State {
                    public static final int $stable = 8;
                    private final Data data;
                    private final boolean isShowing;

                    public static /* synthetic */ State copy$default(State state, Data data, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            data = state.data;
                        }
                        if ((i & 2) != 0) {
                            z = state.isShowing;
                        }
                        return state.copy(data, z);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final Data getData() {
                        return this.data;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final boolean getIsShowing() {
                        return this.isShowing;
                    }

                    public final State copy(Data data, boolean isShowing) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        return new State(data, isShowing);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof State)) {
                            return false;
                        }
                        State state = (State) other;
                        return Intrinsics.areEqual(this.data, state.data) && this.isShowing == state.isShowing;
                    }

                    public int hashCode() {
                        return (this.data.hashCode() * 31) + Boolean.hashCode(this.isShowing);
                    }

                    public String toString() {
                        return "State(data=" + this.data + ", isShowing=" + this.isShowing + ")";
                    }

                    public State(Data data, boolean z) {
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.data = data;
                        this.isShowing = z;
                    }

                    public final Data getData() {
                        return this.data;
                    }

                    public final boolean isShowing() {
                        return this.isShowing;
                    }

                    /* compiled from: CuratedListRhListDetailView.kt */
                    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State$Data;", "", "totalListItemCount", "", "showRhControlsButton", "", "isFuturesOnlyList", "currentSortOption", "Lcom/robinhood/models/ui/SortOption;", "filters", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;", "<init>", "(IZZLcom/robinhood/models/ui/SortOption;Lkotlinx/collections/immutable/ImmutableList;)V", "getTotalListItemCount", "()I", "getShowRhControlsButton", "()Z", "getCurrentSortOption", "()Lcom/robinhood/models/ui/SortOption;", "getFilters", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final /* data */ class Data {
                        public static final int $stable = 8;
                        private final SortOption currentSortOption;
                        private final ImmutableList<CuratedListRhListViewState.Filter> filters;
                        private final boolean isFuturesOnlyList;
                        private final boolean showRhControlsButton;
                        private final int totalListItemCount;

                        public static /* synthetic */ Data copy$default(Data data, int i, boolean z, boolean z2, SortOption sortOption, ImmutableList immutableList, int i2, Object obj) {
                            if ((i2 & 1) != 0) {
                                i = data.totalListItemCount;
                            }
                            if ((i2 & 2) != 0) {
                                z = data.showRhControlsButton;
                            }
                            if ((i2 & 4) != 0) {
                                z2 = data.isFuturesOnlyList;
                            }
                            if ((i2 & 8) != 0) {
                                sortOption = data.currentSortOption;
                            }
                            if ((i2 & 16) != 0) {
                                immutableList = data.filters;
                            }
                            ImmutableList immutableList2 = immutableList;
                            boolean z3 = z2;
                            return data.copy(i, z, z3, sortOption, immutableList2);
                        }

                        /* renamed from: component1, reason: from getter */
                        public final int getTotalListItemCount() {
                            return this.totalListItemCount;
                        }

                        /* renamed from: component2, reason: from getter */
                        public final boolean getShowRhControlsButton() {
                            return this.showRhControlsButton;
                        }

                        /* renamed from: component3, reason: from getter */
                        public final boolean getIsFuturesOnlyList() {
                            return this.isFuturesOnlyList;
                        }

                        /* renamed from: component4, reason: from getter */
                        public final SortOption getCurrentSortOption() {
                            return this.currentSortOption;
                        }

                        public final ImmutableList<CuratedListRhListViewState.Filter> component5() {
                            return this.filters;
                        }

                        public final Data copy(int totalListItemCount, boolean showRhControlsButton, boolean isFuturesOnlyList, SortOption currentSortOption, ImmutableList<CuratedListRhListViewState.Filter> filters) {
                            return new Data(totalListItemCount, showRhControlsButton, isFuturesOnlyList, currentSortOption, filters);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof Data)) {
                                return false;
                            }
                            Data data = (Data) other;
                            return this.totalListItemCount == data.totalListItemCount && this.showRhControlsButton == data.showRhControlsButton && this.isFuturesOnlyList == data.isFuturesOnlyList && Intrinsics.areEqual(this.currentSortOption, data.currentSortOption) && Intrinsics.areEqual(this.filters, data.filters);
                        }

                        public int hashCode() {
                            int iHashCode = ((((Integer.hashCode(this.totalListItemCount) * 31) + Boolean.hashCode(this.showRhControlsButton)) * 31) + Boolean.hashCode(this.isFuturesOnlyList)) * 31;
                            SortOption sortOption = this.currentSortOption;
                            int iHashCode2 = (iHashCode + (sortOption == null ? 0 : sortOption.hashCode())) * 31;
                            ImmutableList<CuratedListRhListViewState.Filter> immutableList = this.filters;
                            return iHashCode2 + (immutableList != null ? immutableList.hashCode() : 0);
                        }

                        public String toString() {
                            return "Data(totalListItemCount=" + this.totalListItemCount + ", showRhControlsButton=" + this.showRhControlsButton + ", isFuturesOnlyList=" + this.isFuturesOnlyList + ", currentSortOption=" + this.currentSortOption + ", filters=" + this.filters + ")";
                        }

                        public Data(int i, boolean z, boolean z2, SortOption sortOption, ImmutableList<CuratedListRhListViewState.Filter> immutableList) {
                            this.totalListItemCount = i;
                            this.showRhControlsButton = z;
                            this.isFuturesOnlyList = z2;
                            this.currentSortOption = sortOption;
                            this.filters = immutableList;
                        }

                        public final int getTotalListItemCount() {
                            return this.totalListItemCount;
                        }

                        public final boolean getShowRhControlsButton() {
                            return this.showRhControlsButton;
                        }

                        public final boolean isFuturesOnlyList() {
                            return this.isFuturesOnlyList;
                        }

                        public final SortOption getCurrentSortOption() {
                            return this.currentSortOption;
                        }

                        public final ImmutableList<CuratedListRhListViewState.Filter> getFilters() {
                            return this.filters;
                        }
                    }
                }
            }
