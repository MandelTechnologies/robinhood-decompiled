package com.robinhood.android.listsoptions.optionwatchlist;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.graph.GraphLayout;
import com.robinhood.android.graph.GraphLayoutViewModel;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.listsoptions.C20943R;
import com.robinhood.android.listsoptions.databinding.MergeOptionWatchlistGraphLayoutBinding;
import com.robinhood.android.options.optionsstring.common.OptionInstrumentDetails2;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import io.reactivex.Observable;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: OptionWatchlistGraphLayout.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 @2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001@B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u0010?¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphLayout;", "Lcom/robinhood/android/graph/TabHeaderGraphLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphViewState;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "j$/time/LocalDate", "addedDate", "expirationDate", "", "settleOnOpen", "isOptionExpired", "", "setTimeFrameTxt", "(Lj$/time/LocalDate;Lj$/time/LocalDate;ZZ)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "draw", "onAttachedToWindow", "()V", "state", "bind", "(Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphViewState;)V", "Lcom/robinhood/android/graph/spark/GraphData;", "graphData", "Lcom/robinhood/models/ui/DataPoint;", "selectedDataPoint", "", "getTimeFrameText", "(Lcom/robinhood/android/graph/spark/GraphData;Lcom/robinhood/models/ui/DataPoint;)Ljava/lang/String;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingEventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getLoggingEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "Ljava/util/UUID;", "optionWatchlistId", "Ljava/util/UUID;", "", "itemCount", "I", "Lcom/robinhood/android/listsoptions/databinding/MergeOptionWatchlistGraphLayoutBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBindings", "()Lcom/robinhood/android/listsoptions/databinding/MergeOptionWatchlistGraphLayoutBinding;", "bindings", "Landroid/graphics/ColorMatrix;", "colorMatrix", "Landroid/graphics/ColorMatrix;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "useGrayscaleMask", "Z", "headerTitleTextAppearance", "getHeaderTitleTextAppearance", "()I", "Companion", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OptionWatchlistGraphLayout extends Hammer_OptionWatchlistGraphLayout implements Bindable<OptionWatchlistGraphViewState> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionWatchlistGraphLayout.class, "bindings", "getBindings()Lcom/robinhood/android/listsoptions/databinding/MergeOptionWatchlistGraphLayoutBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private final ColorMatrix colorMatrix;
    private final int headerTitleTextAppearance;
    private int itemCount;
    private final Screen loggingEventScreen;
    private UUID optionWatchlistId;
    private final Paint paint;
    private boolean useGrayscaleMask;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionWatchlistGraphLayout(Context context, AttributeSet attrs) {
        super(context, attrs, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.loggingEventScreen = new Screen(Screen.Name.OPTION_WATCHLIST_HUB, null, null, null, 14, null);
        this.bindings = ViewBinding5.viewBinding(this, OptionWatchlistGraphLayout2.INSTANCE);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.colorMatrix = colorMatrix;
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.paint = paint;
        this.headerTitleTextAppearance = C20690R.attr.textAppearanceDisplayMedium;
        ViewGroups.inflate(this, C20943R.layout.merge_option_watchlist_graph_layout, true);
        onInitialized();
    }

    @Override // com.robinhood.android.graph.TabHeaderGraphLayout, com.robinhood.android.graph.GraphLayout
    protected Screen getLoggingEventScreen() {
        return this.loggingEventScreen;
    }

    private final MergeOptionWatchlistGraphLayoutBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionWatchlistGraphLayoutBinding) value;
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected int getHeaderTitleTextAppearance() {
        return this.headerTitleTextAppearance;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.useGrayscaleMask) {
            canvas.saveLayer(null, this.paint);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.useGrayscaleMask) {
            canvas.saveLayer(null, this.paint);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    @Override // com.robinhood.android.graph.GraphLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDirectionStyleObservable()), this, false, 2, null).subscribeKotlin(new C209461(ScarletManager2.getScarletManager(this)));
        Observable<Optional<Integer>> observableDebounce = getBindings().graphLayoutGraphView.getHistoricalScrubbedObservable().debounce(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDebounce), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistGraphLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionWatchlistGraphLayout.onAttachedToWindow$lambda$2(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: OptionWatchlistGraphLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistGraphLayout$onAttachedToWindow$1 */
    /* synthetic */ class C209461 extends AdaptedFunctionReference implements Function1<ScarletOverlay, Unit> {
        C209461(Object obj) {
            super(1, obj, ScarletManager.class, "putOverlay", "putOverlay(Lcom/robinhood/scarlet/ScarletOverlay;Ljava/lang/Boolean;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScarletOverlay scarletOverlay) {
            invoke2(scarletOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ScarletOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ScarletManager.putOverlay$default((ScarletManager) this.receiver, p0, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2(OptionWatchlistGraphLayout optionWatchlistGraphLayout, Optional optional) {
        Integer num = (Integer) optional.component1();
        UUID uuid = optionWatchlistGraphLayout.optionWatchlistId;
        if (num != null && uuid != null) {
            EventLoggers3.logOptionWatchlistCharScrubbing(optionWatchlistGraphLayout.getEventLogger(), uuid, optionWatchlistGraphLayout.itemCount);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(OptionWatchlistGraphViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Boolean boolIsOptionExpired = state.getIsOptionExpired();
        if (boolIsOptionExpired != null) {
            boolean zBooleanValue = boolIsOptionExpired.booleanValue();
            this.useGrayscaleMask = zBooleanValue;
            String formattedTitleStringWithExpirationSubtitle = null;
            GraphLayout.setCandlestickChartEnabled$default(this, false, false, 2, null);
            if (state.getUnderlyingType() != null) {
                OptionInstrument optionInstrument = state.getOptionInstrument();
                if (optionInstrument != null) {
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    formattedTitleStringWithExpirationSubtitle = OptionInstrumentDetails2.getFormattedTitleStringWithExpirationSubtitle(optionInstrument, resources, state.getUnderlyingType());
                }
                setHeaderTitleTxt(formattedTitleStringWithExpirationSubtitle);
            }
            if (state.getOptionChain() != null) {
                setTimeFrameTxt(state.getAddedDate(), state.getExpirationDate(), state.getOptionChain().getSettleOnOpen(), zBooleanValue);
            }
            if (state.getDaysSinceAddedToWatchlist() != null) {
                getIntervalSelector().updateOptionWatchlistMode(state.getDaysSinceAddedToWatchlist().intValue());
            }
            GraphLayoutViewModel graphLayoutViewModel = state.getGraphLayoutViewModel();
            if (graphLayoutViewModel != null) {
                setData(graphLayoutViewModel);
            }
            GraphData graphData = state.getGraphData(getGraphSelection());
            if (graphData != null) {
                setGraphData(graphData);
            }
            this.optionWatchlistId = state.getOptionWatchlistId();
            this.itemCount = state.getItemCount();
        }
    }

    private final void setTimeFrameTxt(LocalDate addedDate, LocalDate expirationDate, boolean settleOnOpen, boolean isOptionExpired) {
        String string2;
        int i;
        if (addedDate == null) {
            return;
        }
        getBindings().timeframeStartTxt.setText(ViewsKt.getString(this, C20943R.string.option_watchlist_added_date, LocalDateFormatter.SHORT_WITH_OPTIONAL_YEAR.format(addedDate)));
        RhTextView rhTextView = getBindings().timeframeEndTxt;
        if (isOptionExpired && expirationDate != null) {
            if (settleOnOpen) {
                i = C20943R.string.option_watchlist_expiration_date_settle_on_open;
            } else {
                i = C20943R.string.option_watchlist_expiration_date;
            }
            string2 = ViewsKt.getString(this, i, OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(expirationDate));
        } else if (!isOptionExpired) {
            string2 = ViewsKt.getString(this, C20943R.string.option_watchlist_now);
        } else {
            string2 = "";
        }
        rhTextView.setText(string2);
    }

    @Override // com.robinhood.android.graph.GraphLayout
    protected String getTimeFrameText(GraphData graphData, DataPoint selectedDataPoint) {
        if (selectedDataPoint != null) {
            return super.getTimeFrameText(graphData, selectedDataPoint);
        }
        return ViewsKt.getString(this, C20943R.string.option_watchlist_label_since_added);
    }

    /* compiled from: OptionWatchlistGraphLayout.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphLayout$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistGraphLayout;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionWatchlistGraphLayout> {
        private final /* synthetic */ Inflater<OptionWatchlistGraphLayout> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionWatchlistGraphLayout inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionWatchlistGraphLayout) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20943R.layout.include_option_watchlist_graph_layout);
        }
    }
}
