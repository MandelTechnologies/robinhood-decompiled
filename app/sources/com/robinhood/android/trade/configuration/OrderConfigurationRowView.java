package com.robinhood.android.trade.configuration;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.trade.configuration.OrderConfigurationSelectionAdapter;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.resource.StringResource;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OrderConfigurationRowView.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 92\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00019B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b\"\u0010#R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u000f\u001a\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title$delegate", "Lkotlin/properties/ReadOnlyProperty;", "subtitle", "getSubtitle", "subtitle$delegate", "header", "Landroidx/compose/ui/platform/ComposeView;", "getHeader", "()Landroidx/compose/ui/platform/ComposeView;", "header$delegate", Footer.f10637type, "getFooter", "footer$delegate", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "image$delegate", StatisticsSection2.DIVIDER, "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "divider$delegate", "newChip", "Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", "getNewChip", "()Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", "newChip$delegate", "callbacks", "Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/trade/configuration/OrderConfigurationSelectionAdapter$Callbacks;)V", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "getItem", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "setItem", "(Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;)V", "bind", "", "state", "Companion", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderConfigurationRowView extends RdsRippleContainerView implements Bindable<OrderConfigurationResource> {
    private OrderConfigurationSelectionAdapter.Callbacks callbacks;

    /* renamed from: divider$delegate, reason: from kotlin metadata */
    private final Interfaces2 divider;

    /* renamed from: footer$delegate, reason: from kotlin metadata */
    private final Interfaces2 footer;

    /* renamed from: header$delegate, reason: from kotlin metadata */
    private final Interfaces2 header;

    /* renamed from: image$delegate, reason: from kotlin metadata */
    private final Interfaces2 image;
    private OrderConfigurationRow item;

    /* renamed from: newChip$delegate, reason: from kotlin metadata */
    private final Interfaces2 newChip;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    private final Interfaces2 subtitle;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    private final Interfaces2 title;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderConfigurationRowView.class, "title", "getTitle()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfigurationRowView.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfigurationRowView.class, "header", "getHeader()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfigurationRowView.class, Footer.f10637type, "getFooter()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfigurationRowView.class, "image", "getImage()Landroid/widget/ImageView;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfigurationRowView.class, StatisticsSection2.DIVIDER, "getDivider()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OrderConfigurationRowView.class, "newChip", "getNewChip()Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderConfigurationRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfigurationRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.title = BindViewDelegate2.bindView$default(this, C29312R.id.title, null, 2, null);
        this.subtitle = BindViewDelegate2.bindView$default(this, C29312R.id.subtitle, null, 2, null);
        this.header = BindViewDelegate2.bindView$default(this, C29312R.id.header, null, 2, null);
        this.footer = BindViewDelegate2.bindView$default(this, C29312R.id.footer, null, 2, null);
        this.image = BindViewDelegate2.bindView$default(this, C29312R.id.image, null, 2, null);
        this.divider = BindViewDelegate2.bindView$default(this, C29312R.id.divider, null, 2, null);
        this.newChip = BindViewDelegate2.bindView$default(this, C29312R.id.new_chip, null, 2, null);
        ViewGroups.inflate(this, C29312R.layout.merge_order_configuration_row, true);
    }

    private final TextView getTitle() {
        return (TextView) this.title.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getSubtitle() {
        return (TextView) this.subtitle.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeView getHeader() {
        return (ComposeView) this.header.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeView getFooter() {
        return (ComposeView) this.footer.getValue(this, $$delegatedProperties[3]);
    }

    private final ImageView getImage() {
        return (ImageView) this.image.getValue(this, $$delegatedProperties[4]);
    }

    private final View getDivider() {
        return (View) this.divider.getValue(this, $$delegatedProperties[5]);
    }

    private final RdsInfoTag getNewChip() {
        return (RdsInfoTag) this.newChip.getValue(this, $$delegatedProperties[6]);
    }

    public final OrderConfigurationSelectionAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(OrderConfigurationSelectionAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final OrderConfigurationRow getItem() {
        return this.item;
    }

    public final void setItem(OrderConfigurationRow orderConfigurationRow) {
        this.item = orderConfigurationRow;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final OrderConfigurationResource state) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(state, "state");
        getTitle().setEnabled(!state.getDisabled());
        getHeader().post(new Runnable() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.1
            @Override // java.lang.Runnable
            public final void run() {
                ComposeView header = OrderConfigurationRowView.this.getHeader();
                final OrderConfigurationRowView orderConfigurationRowView = OrderConfigurationRowView.this;
                final OrderConfigurationResource orderConfigurationResource = state;
                header.setContent(ComposableLambda3.composableLambdaInstance(-78739322, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.1.1
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
                            ComposerKt.traceEventStart(-78739322, i, -1, "com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.<anonymous>.<anonymous> (OrderConfigurationRowView.kt:43)");
                        }
                        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(orderConfigurationRowView));
                        final OrderConfigurationResource orderConfigurationResource2 = orderConfigurationResource;
                        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(1835462548, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i2) {
                                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1835462548, i2, -1, "com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.<anonymous>.<anonymous>.<anonymous> (OrderConfigurationRowView.kt:44)");
                                }
                                Function2<Composer, Integer, Unit> headerComposable = orderConfigurationResource2.getHeaderComposable();
                                if (headerComposable == null) {
                                    headerComposable = OrderConfigurationRowView2.INSTANCE.m2482x5ae56886();
                                }
                                headerComposable.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        });
        getFooter().setVisibility(state.getFooterComposable() != null ? 0 : 8);
        getFooter().post(new Runnable() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.2
            @Override // java.lang.Runnable
            public final void run() {
                ComposeView footer = OrderConfigurationRowView.this.getFooter();
                final OrderConfigurationRowView orderConfigurationRowView = OrderConfigurationRowView.this;
                final OrderConfigurationResource orderConfigurationResource = state;
                footer.setContent(ComposableLambda3.composableLambdaInstance(-949387985, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.2.1
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
                            ComposerKt.traceEventStart(-949387985, i, -1, "com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.<anonymous>.<anonymous> (OrderConfigurationRowView.kt:53)");
                        }
                        Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(orderConfigurationRowView));
                        final OrderConfigurationResource orderConfigurationResource2 = orderConfigurationResource;
                        BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(352606397, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.2.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i2) {
                                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(352606397, i2, -1, "com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.<anonymous>.<anonymous>.<anonymous> (OrderConfigurationRowView.kt:54)");
                                }
                                Function2<Composer, Integer, Unit> footerComposable = orderConfigurationResource2.getFooterComposable();
                                if (footerComposable == null) {
                                    footerComposable = OrderConfigurationRowView2.INSTANCE.m2483x995bb4d1();
                                }
                                footerComposable.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        });
        getTitle().setText(state.getTitleRes());
        getSubtitle().setEnabled(!state.getDisabled());
        List<Either<String, StringResource>> subtitleFormatArgs = state.getSubtitleFormatArgs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subtitleFormatArgs, 10));
        Iterator<T> it = subtitleFormatArgs.iterator();
        while (it.hasNext()) {
            Either either = (Either) it.next();
            if (either instanceof Either.Left) {
                text = (CharSequence) ((Either.Left) either).getValue();
            } else {
                if (!(either instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                StringResource stringResource = (StringResource) ((Either.Right) either).getValue();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = stringResource.getText(resources);
            }
            arrayList.add(text);
        }
        getSubtitle().setVisibility(state.getSubtitleRes() != null ? 0 : 8);
        Integer subtitleRes = state.getSubtitleRes();
        if (subtitleRes != null) {
            int iIntValue = subtitleRes.intValue();
            TextView subtitle = getSubtitle();
            Resources resources2 = getResources();
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            subtitle.setText(resources2.getString(iIntValue, Arrays.copyOf(charSequenceArr, charSequenceArr.length)));
        }
        if (WhenMappings.$EnumSwitchMapping$0[state.getDayNightOverlay().ordinal()] == 1) {
            getImage().setImageResource(state.getDayDrawableRes());
            getNewChip().setTextColor(getResources().getColor(C11048R.color.text_color_primary_inverse_day, getContext().getTheme()));
        } else {
            getImage().setImageResource(state.getNightDrawableRes());
            getNewChip().setTextColor(getResources().getColor(C11048R.color.text_color_primary_inverse_night, getContext().getTheme()));
        }
        getDivider().setVisibility(state.getShowDivider() ? 0 : 4);
        getNewChip().setVisibility(state.getNew() ? 0 : 8);
        getNewChip().setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationRowView.bind.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrderConfigurationSelectionAdapter.Callbacks callbacks;
                OrderConfigurationRow item = OrderConfigurationRowView.this.getItem();
                if (item == null || (callbacks = OrderConfigurationRowView.this.getCallbacks()) == null) {
                    return;
                }
                callbacks.onOrderConfigurationRowClicked(item);
            }
        });
    }

    /* compiled from: OrderConfigurationRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OrderConfigurationRowView> {
        private final /* synthetic */ Inflater<OrderConfigurationRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OrderConfigurationRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OrderConfigurationRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C29312R.layout.include_order_configuration_row);
        }
    }
}
