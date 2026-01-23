package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.template.LoadContentRequest;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.android.odyssey.lib.view.SdScrollViewerContainer;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdScrollViewer;
import com.robinhood.models.api.serverdrivenui.component.ApiSdScrollViewerContentComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdScrollViewer.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u0006:\u0002;<B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0016J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0016J(\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0014J\u0016\u0010-\u001a\u00020\u001f2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\u0010\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0019H\u0002J\u0012\u00103\u001a\u00020\u001f2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\b\u00106\u001a\u00020\u001fH\u0002J\b\u00107\u001a\u000208H\u0014J\u0012\u00109\u001a\u00020\u001f2\b\u0010:\u001a\u0004\u0018\u000108H\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdScrollViewer;", "Landroidx/core/widget/NestedScrollView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdScrollViewer;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdScrollViewer$ApiSdScrollViewerData;", "Lcom/robinhood/android/odyssey/lib/view/SdScrollViewer$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdScrollViewerContainer$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdScrollViewer$ApiSdScrollViewerData;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdScrollViewer$ApiSdScrollViewerData;)V", "container", "Lcom/robinhood/android/odyssey/lib/view/SdScrollViewerContainer;", "getContainer", "()Lcom/robinhood/android/odyssey/lib/view/SdScrollViewerContainer;", "container$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isLoaded", "", "()Z", "onScrollToBottomActionData", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction;", "isScrolledToBottom", "onFinishInflate", "", "bind", "component", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSizeChanged", "w", "", "h", "oldw", "oldh", "submitLoadContentRequests", "requests", "", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "scrollToBottom", "shouldScrollToBottom", "scrollToComponent", "componentId", "", "onScrollOrContainerLayoutChange", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Callbacks", "ScrollViewerSavedState", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdScrollViewer extends NestedScrollView implements SdBaseView<ApiSdScrollViewer, ApiSdScrollViewer.ApiSdScrollViewerData, Callbacks>, SdScrollViewerContainer.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdScrollViewer.class, "container", "getContainer()Lcom/robinhood/android/odyssey/lib/view/SdScrollViewerContainer;", 0))};
    public static final int $stable = 8;

    /* renamed from: container$delegate, reason: from kotlin metadata */
    private final Interfaces2 container;
    private ApiSdScrollViewer.ApiSdScrollViewerData data;
    private boolean isScrolledToBottom;
    private ApiSdAction onScrollToBottomActionData;

    /* compiled from: SdScrollViewer.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdScrollViewer$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "loadContents", "", "requestedInfo", "", "Lcom/robinhood/android/odyssey/lib/template/LoadContentRequest;", "onFinishLoadingAction", "Lkotlin/Function0;", "onScrollChange", "scrolled", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends SdBaseView.Callbacks {
        void loadContents(List<? extends LoadContentRequest> requestedInfo, Function0<Unit> onFinishLoadingAction);

        void onScrollChange(boolean scrolled);
    }

    /* compiled from: SdScrollViewer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiSdScrollViewer.ScrollPointType.values().length];
            try {
                iArr[ApiSdScrollViewer.ScrollPointType.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSdScrollViewer.ScrollPointType.COMPONENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onRestoreState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onRestoreState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Parcelable onSaveState(Parcelable parcelable) {
        return SdBaseView.DefaultImpls.onSaveState(this, parcelable);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        return SdBaseView.DefaultImpls.onSubmitValue(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Map<String, ApiSdTypedValue> requireAlternateComponentOnSubmitValueMap() {
        return SdBaseView.DefaultImpls.requireAlternateComponentOnSubmitValueMap(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public Callbacks requireComponentCallbacks() {
        return (Callbacks) SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdScrollViewer.ApiSdScrollViewerData apiSdScrollViewerData, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, apiSdScrollViewerData, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdScrollViewer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C20335R.layout.merge_sd_scroll_viewer_content, this);
        this.container = BindViewDelegate2.bindView$default(this, C20335R.id.sd_scroll_viewer_content_container, null, 2, null);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdScrollViewer.ApiSdScrollViewerData getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdScrollViewer.ApiSdScrollViewerData apiSdScrollViewerData) {
        this.data = apiSdScrollViewerData;
    }

    private final SdScrollViewerContainer getContainer() {
        return (SdScrollViewerContainer) this.container.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLoaded() {
        return getContainer().getVisibility() == 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        getContainer().initialize(this);
        setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdScrollViewer.onFinishInflate.1
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                SdScrollViewer.this.onScrollOrContainerLayoutChange();
                if (SdScrollViewer.this.isLoaded()) {
                    ((Callbacks) SdScrollViewer.this.requireComponentCallbacks()).onScrollChange(i2 != 0);
                }
            }
        });
        getContainer().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.odyssey.lib.view.SdScrollViewer.onFinishInflate.2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                SdScrollViewer.this.onScrollOrContainerLayoutChange();
            }
        });
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdScrollViewer component) {
        Intrinsics.checkNotNullParameter(component, "component");
        SdBaseView.DefaultImpls.bind(this, component);
        List<ApiSdScrollViewerContentComponent> content = component.getData().getContent();
        if (content != null) {
            getContainer().bindList(content);
        } else {
            getContainer().setVisibility(4);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdScrollViewer.ApiSdScrollViewerData mergeNewData(ApiSdScrollViewer.ApiSdScrollViewerData newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdScrollViewer.ApiSdScrollViewerData) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdScrollViewer.ApiSdScrollViewerData.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdScrollViewer.ApiSdScrollViewerData newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        ApiSdAction on_scroll_to_bottom = newData.getOn_scroll_to_bottom();
        if (on_scroll_to_bottom != null) {
            new MutablePropertyReference0Impl(this) { // from class: com.robinhood.android.odyssey.lib.view.SdScrollViewer$onDataUpdated$1$2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((SdScrollViewer) this.receiver).onScrollToBottomActionData;
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
                public void set(Object obj) {
                    ((SdScrollViewer) this.receiver).onScrollToBottomActionData = (ApiSdAction) obj;
                }
            }.set(on_scroll_to_bottom);
        }
        Boolean scroll_to_bottom = newData.getScroll_to_bottom();
        if (scroll_to_bottom != null) {
            scrollToBottom(scroll_to_bottom.booleanValue());
        }
        ApiSdScrollViewer.ApiSdScrollPoint scroll_point = newData.getScroll_point();
        if (scroll_point != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[scroll_point.getType().ordinal()];
            if (i == 1) {
                scrollToBottom(true);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scrollToComponent(scroll_point.getComponent_id());
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this.isScrolledToBottom) {
            scrollToBottom(true);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdScrollViewerContainer.Callbacks
    public void submitLoadContentRequests(List<? extends LoadContentRequest> requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        getContainer().setVisibility(4);
        ((Callbacks) requireComponentCallbacks()).loadContents(requests, new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdScrollViewer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdScrollViewer.submitLoadContentRequests$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitLoadContentRequests$lambda$5(SdScrollViewer sdScrollViewer) {
        sdScrollViewer.getContainer().setVisibility(0);
        return Unit.INSTANCE;
    }

    private final void scrollToBottom(boolean shouldScrollToBottom) {
        if (isLoaded()) {
            if (shouldScrollToBottom) {
                IdlingResourceCounters2.setBusy(IdlingResourceType.ODYSSEY_AGREEMENT_SCROLL, true);
                smoothScrollTo(0, getContainer().getBottom());
            } else {
                this.isScrolledToBottom = false;
                smoothScrollTo(0, 0);
            }
        }
    }

    private final void scrollToComponent(String componentId) {
        if (isLoaded()) {
            View viewFindViewWithTag = findViewWithTag(componentId);
            if (viewFindViewWithTag == null) {
                smoothScrollTo(0, getContainer().getBottom());
                CrashReporter.Companion companion = CrashReporter.INSTANCE;
                ApiSdScrollViewer.ApiSdScrollViewerData data = getData();
                CrashReporter.DefaultImpls.reportNonFatal$default(companion, new Throwable("No component for " + componentId + " within scroll viewer " + (data != null ? data.getId() : null)), false, null, 4, null);
                return;
            }
            smoothScrollTo(0, viewFindViewWithTag.getTop());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrollOrContainerLayoutChange() {
        if (!isLoaded() || canScrollVertically(1)) {
            return;
        }
        if (!this.isScrolledToBottom) {
            this.isScrolledToBottom = true;
            ApiSdAction apiSdAction = this.onScrollToBottomActionData;
            if (apiSdAction != null) {
                ((Callbacks) requireComponentCallbacks()).onComponentAction(null, apiSdAction);
            }
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.ODYSSEY_AGREEMENT_SCROLL, false);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        return new ScrollViewerSavedState(this.isScrolledToBottom, onSaveState(super.onSaveInstanceState()));
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdScrollViewer.ScrollViewerSavedState");
        ScrollViewerSavedState scrollViewerSavedState = (ScrollViewerSavedState) state;
        this.isScrolledToBottom = scrollViewerSavedState.getIsScrolledToBottom();
        super.onRestoreInstanceState(onRestoreState(scrollViewerSavedState.getSavedState()));
    }

    /* compiled from: SdScrollViewer.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdScrollViewer$ScrollViewerSavedState;", "Landroid/os/Parcelable;", "isScrolledToBottom", "", "savedState", "<init>", "(ZLandroid/os/Parcelable;)V", "()Z", "getSavedState", "()Landroid/os/Parcelable;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ScrollViewerSavedState implements Parcelable {
        public static final Parcelable.Creator<ScrollViewerSavedState> CREATOR = new Creator();
        private final boolean isScrolledToBottom;
        private final Parcelable savedState;

        /* compiled from: SdScrollViewer.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ScrollViewerSavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScrollViewerSavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScrollViewerSavedState(parcel.readInt() != 0, parcel.readParcelable(ScrollViewerSavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScrollViewerSavedState[] newArray(int i) {
                return new ScrollViewerSavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isScrolledToBottom ? 1 : 0);
            dest.writeParcelable(this.savedState, flags);
        }

        public ScrollViewerSavedState(boolean z, Parcelable parcelable) {
            this.isScrolledToBottom = z;
            this.savedState = parcelable;
        }

        /* renamed from: isScrolledToBottom, reason: from getter */
        public final boolean getIsScrolledToBottom() {
            return this.isScrolledToBottom;
        }

        public final Parcelable getSavedState() {
            return this.savedState;
        }
    }
}
