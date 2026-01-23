package com.robinhood.android.optionchain;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.optionchain.BaseOptionInstrumentRowModel;
import com.robinhood.android.optionchain.BaseOptionRowView.Callbacks;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BaseOptionRowView.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b'\u0018\u0000 :*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u00029:B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0015J\u001b\u00100\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018J\u0006\u00101\u001a\u00020\u0013J\u001d\u00102\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0004¢\u0006\u0002\u00103J\b\u00104\u001a\u00020\u0013H\u0004J\b\u00105\u001a\u00020\u0013H\u0004J\b\u00106\u001a\u00020\u0013H\u0004J\b\u00107\u001a\u00020\u0013H\u0004J\b\u00108\u001a\u00020\u0013H\u0004R\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u001a\u001a\u0004\u0018\u00018\u0001X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00018\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010*\u001a\u00020+X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/optionchain/BaseOptionRowView;", "C", "Lcom/robinhood/android/optionchain/BaseOptionRowView$Callbacks;", "M", "Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "bindToViews", "", "model", "(Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;)V", "setOnClickListeners", "callbacks", "(Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;Lcom/robinhood/android/optionchain/BaseOptionRowView$Callbacks;)V", "setViewColorAttributes", "viewModel", "getViewModel", "()Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;", "setViewModel", "Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;", "getCallbacks", "()Lcom/robinhood/android/optionchain/BaseOptionRowView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/optionchain/BaseOptionRowView$Callbacks;)V", "Lcom/robinhood/android/optionchain/BaseOptionRowView$Callbacks;", "lastBoundIdentifier", "", "getLastBoundIdentifier", "()Ljava/lang/String;", "setLastBoundIdentifier", "(Ljava/lang/String;)V", "bottomDividerVisible", "", "getBottomDividerVisible", "()Z", "setBottomDividerVisible", "(Z)V", "bind", "showRipple", "launchStatisticsDetail", "(Lcom/robinhood/android/optionchain/BaseOptionRowView$Callbacks;Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;)V", "logOptionInstrumentRowTap", "logOptionInstrumentPrimaryTap", "logOptionInstrumentSecondaryTap", "logOptionInstrumentRowSelect", "logOptionInstrumentRowDeselect", "Callbacks", "Companion", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class BaseOptionRowView<C extends Callbacks<M>, M extends BaseOptionInstrumentRowModel> extends ConstraintLayout {
    private static final ThemedResourceReference<ColorStateList> DISABLED_TEXT_COLOR_REFERENCE;
    private static final ThemedResourceReference<ColorStateList> SELECTED_TEXT_COLOR_REFERENCE;
    private static final ThemedResourceReference<ColorStateList> STALE_TEXT_COLOR_REFERENCE;
    private C callbacks;
    private String lastBoundIdentifier;
    private M viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BaseOptionRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0002H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionchain/BaseOptionRowView$Callbacks;", "M", "Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;", "", "onLaunchStatisticsDetail", "", "model", "(Lcom/robinhood/android/optionchain/BaseOptionInstrumentRowModel;)V", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks<M extends BaseOptionInstrumentRowModel> {
        void onLaunchStatisticsDetail(M model);
    }

    protected static final ThemedResourceReference<ColorStateList> getDISABLED_TEXT_COLOR_REFERENCE() {
        return INSTANCE.getDISABLED_TEXT_COLOR_REFERENCE();
    }

    protected static final ThemedResourceReference<ColorStateList> getSELECTED_TEXT_COLOR_REFERENCE() {
        return INSTANCE.getSELECTED_TEXT_COLOR_REFERENCE();
    }

    protected static final ThemedResourceReference<ColorStateList> getSTALE_TEXT_COLOR_REFERENCE() {
        return INSTANCE.getSTALE_TEXT_COLOR_REFERENCE();
    }

    public abstract void bindToViews(M model);

    public abstract boolean getBottomDividerVisible();

    public abstract EventLogger getEventLogger();

    public abstract void setBottomDividerVisible(boolean z);

    public abstract void setEventLogger(EventLogger eventLogger);

    public abstract void setOnClickListeners(M model, C callbacks);

    public abstract void setViewColorAttributes(M model);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOptionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    protected final M getViewModel() {
        return this.viewModel;
    }

    protected final void setViewModel(M m) {
        this.viewModel = m;
    }

    protected final C getCallbacks() {
        return this.callbacks;
    }

    protected final void setCallbacks(C c) {
        this.callbacks = c;
    }

    protected final String getLastBoundIdentifier() {
        return this.lastBoundIdentifier;
    }

    protected final void setLastBoundIdentifier(String str) {
        this.lastBoundIdentifier = str;
    }

    public final void bind(M model, C callbacks) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.viewModel = model;
        this.callbacks = callbacks;
        bindToViews(model);
        setOnClickListeners(model, callbacks);
        setViewColorAttributes(model);
    }

    public final void showRipple() {
        final String str = this.lastBoundIdentifier;
        postDelayed(new Runnable() { // from class: com.robinhood.android.optionchain.BaseOptionRowView$showRipple$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                if (Intrinsics.areEqual(this.this$0.getLastBoundIdentifier(), str)) {
                    Views.dispatchDrawableHotspotChangedCompat(this.this$0, this.this$0.getWidth() / 2.0f, this.this$0.getHeight() / 2.0f);
                    this.this$0.setPressed(true);
                    final BaseOptionRowView baseOptionRowView = this.this$0;
                    baseOptionRowView.postDelayed(new Runnable() { // from class: com.robinhood.android.optionchain.BaseOptionRowView$showRipple$lambda$1$$inlined$postDelayed$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            baseOptionRowView.setPressed(false);
                        }
                    }, 250L);
                }
            }
        }, 250L);
    }

    protected final void launchStatisticsDetail(C callbacks, M model) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(model, "model");
        logOptionInstrumentRowTap();
        callbacks.onLaunchStatisticsDetail(model);
    }

    protected final void logOptionInstrumentRowTap() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.TAP_OPTION_INSTRUMENT_ROW, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    protected final void logOptionInstrumentPrimaryTap() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.TAP_OPTION_INSTRUMENT_PRIMARY_BUTTON, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    protected final void logOptionInstrumentSecondaryTap() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.TAP_OPTION_INSTRUMENT_SECONDARY_BUTTON, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    protected final void logOptionInstrumentRowSelect() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    protected final void logOptionInstrumentRowDeselect() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DESELECT, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, null, null, 6, null), null, null, false, 56, null);
    }

    /* compiled from: BaseOptionRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0004X\u0085\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0004X\u0085\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\tR\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0004X\u0085\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionchain/BaseOptionRowView$Companion;", "", "<init>", "()V", "DISABLED_TEXT_COLOR_REFERENCE", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "Landroid/content/res/ColorStateList;", "getDISABLED_TEXT_COLOR_REFERENCE$annotations", "getDISABLED_TEXT_COLOR_REFERENCE", "()Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "STALE_TEXT_COLOR_REFERENCE", "getSTALE_TEXT_COLOR_REFERENCE$annotations", "getSTALE_TEXT_COLOR_REFERENCE", "SELECTED_TEXT_COLOR_REFERENCE", "getSELECTED_TEXT_COLOR_REFERENCE$annotations", "getSELECTED_TEXT_COLOR_REFERENCE", "feature-lib-option-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        protected static /* synthetic */ void getDISABLED_TEXT_COLOR_REFERENCE$annotations() {
        }

        @JvmStatic
        protected static /* synthetic */ void getSELECTED_TEXT_COLOR_REFERENCE$annotations() {
        }

        @JvmStatic
        protected static /* synthetic */ void getSTALE_TEXT_COLOR_REFERENCE$annotations() {
        }

        private Companion() {
        }

        protected final ThemedResourceReference<ColorStateList> getDISABLED_TEXT_COLOR_REFERENCE() {
            return BaseOptionRowView.DISABLED_TEXT_COLOR_REFERENCE;
        }

        protected final ThemedResourceReference<ColorStateList> getSTALE_TEXT_COLOR_REFERENCE() {
            return BaseOptionRowView.STALE_TEXT_COLOR_REFERENCE;
        }

        protected final ThemedResourceReference<ColorStateList> getSELECTED_TEXT_COLOR_REFERENCE() {
            return BaseOptionRowView.SELECTED_TEXT_COLOR_REFERENCE;
        }
    }

    static {
        ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
        DISABLED_TEXT_COLOR_REFERENCE = new ThemedResourceReference<>(color_state_list, C20690R.attr.colorForeground3);
        STALE_TEXT_COLOR_REFERENCE = new ThemedResourceReference<>(color_state_list, C20690R.attr.colorForeground2);
        SELECTED_TEXT_COLOR_REFERENCE = new ThemedResourceReference<>(color_state_list, C20690R.attr.colorBackground1);
    }
}
