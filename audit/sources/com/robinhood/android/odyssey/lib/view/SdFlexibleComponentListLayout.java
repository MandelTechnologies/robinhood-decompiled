package com.robinhood.android.odyssey.lib.view;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroup2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAnimationComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdButtonComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdDividerComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdGenericComponentList;
import com.robinhood.models.api.serverdrivenui.component.ApiSdImageComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInformationalRowComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdSectionComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextIndividualComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.part.ApiSdAxis;
import com.robinhood.models.api.serverdrivenui.part.ApiSdGravity;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.api.ApiThemedColor;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import p479j$.time.LocalDateTime;

/* compiled from: SdFlexibleComponentListLayout.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003:\u00016B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u0002H\u0014J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u0013H\u0002J \u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020\u001aH\u0014J\b\u0010/\u001a\u000200H\u0014J\u0012\u00101\u001a\u00020\u001a2\b\u00102\u001a\u0004\u0018\u000100H\u0014J\u000e\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u000205R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0015\u0010\u0016¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdFlexibleComponentListLayout;", "Lcom/robinhood/android/odyssey/lib/view/SdLinearLayout;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList$Data;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList$Data;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList$Data;)V", "value", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList$ListLayout;", "listLayout", "setListLayout", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList$ListLayout;)V", "mergeNewData", "newData", "bind", "", "component", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "inflateChild", "Landroid/view/View;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "overrideBackgroundTint", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/api/ApiThemedColor;", "setLayout", "layout", "setChildLayout", "listAxis", "Lcom/robinhood/models/api/serverdrivenui/part/ApiSdAxis;", "childLayout", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Layout;", "childView", "doBeforeAddingChildren", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "toggleButtonLoading", "loading", "", "SavedState", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdFlexibleComponentListLayout extends SdLinearLayout<ApiSdFlexibleComponent> implements SdBaseView<ApiSdGenericComponentList, ApiSdGenericComponentList.Data, SdBaseView.Callbacks> {
    public static final int $stable = 8;
    private ApiSdGenericComponentList.Data data;
    private ApiSdGenericComponentList.ListLayout listLayout;

    /* compiled from: SdFlexibleComponentListLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiSdAxis.values().length];
            try {
                iArr[ApiSdAxis.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSdAxis.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSdGravity.values().length];
            try {
                iArr2[ApiSdGravity.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ApiSdGravity.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiSdGravity.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
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
    public SdBaseView.Callbacks requireComponentCallbacks() {
        return SdBaseView.DefaultImpls.requireComponentCallbacks(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public View requireSdView() {
        return SdBaseView.DefaultImpls.requireSdView(this);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void update(ApiSdGenericComponentList.Data data, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, data, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdFlexibleComponentListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdGenericComponentList.Data getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdGenericComponentList.Data data) {
        this.data = data;
    }

    private final void setListLayout(ApiSdGenericComponentList.ListLayout listLayout) {
        this.listLayout = listLayout;
        if (listLayout != null) {
            setLayout(listLayout);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdGenericComponentList.Data mergeNewData(ApiSdGenericComponentList.Data newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdGenericComponentList.Data) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdGenericComponentList.Data.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdGenericComponentList component) {
        Intrinsics.checkNotNullParameter(component, "component");
        setListLayout(component.getLayout());
        SdBaseView.DefaultImpls.bind(this, component);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdGenericComponentList.Data newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        if (updateSource != SdBaseView.UpdateSource.RESTORE) {
            bindList(newData.getContent());
        }
        ApiThemedColor background_color = newData.getBackground_color();
        if (background_color != null) {
            overrideBackgroundTint(background_color);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    public View inflateChild(int index, ApiSdFlexibleComponent component) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(component, "component");
        if (component instanceof ApiSdTextIndividualComponent) {
            viewInflate = SdTextView.INSTANCE.inflate((ViewGroup) this);
        } else if (component instanceof ApiSdButtonComponent) {
            viewInflate = SdBaseButtonView.INSTANCE.inflate(this, ((ApiSdButtonComponent) component).getData().getStyle());
        } else if (component instanceof ApiSdInformationalRowComponent) {
            viewInflate = SdInformationalRow.INSTANCE.inflate((ViewGroup) this);
        } else if (component instanceof ApiSdImageComponent) {
            viewInflate = SdImageView.INSTANCE.inflate((ViewGroup) this);
        } else if (component instanceof ApiSdDividerComponent) {
            viewInflate = SdDivider.INSTANCE.inflate((ViewGroup) this);
        } else if (component instanceof ApiSdAnimationComponent) {
            viewInflate = SdAnimationView.INSTANCE.inflate((ViewGroup) this);
        } else {
            if (!(component instanceof ApiSdSectionComponent)) {
                throw new IllegalStateException(("unsupported type " + component).toString());
            }
            viewInflate = SdSectionView.INSTANCE.inflate((ViewGroup) this);
        }
        ApiSdFlexibleComponent.Layout layout = component.getLayout();
        if (layout == null) {
            throw new IllegalArgumentException(("generic list require layouts in child " + component).toString());
        }
        ApiSdGenericComponentList.ListLayout listLayout = this.listLayout;
        if (listLayout == null) {
            throw new IllegalArgumentException("need to know list layout when inflating children");
        }
        setChildLayout(listLayout.getAxis(), layout, viewInflate);
        return viewInflate;
    }

    private final void overrideBackgroundTint(ApiThemedColor color) {
        if (getBackground() == null) {
            setBackgroundColor(-1);
        }
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = ServerToBentoColorMapper.INSTANCE.mapDayNightSelectorServerColor(color.getLight(), color.getDark());
        if (resourceReferences4MapDayNightSelectorServerColor != null) {
            ScarletManager2.overrideAttribute(this, R.attr.backgroundTint, resourceReferences4MapDayNightSelectorServerColor);
        }
    }

    private final void setLayout(ApiSdGenericComponentList.ListLayout layout) {
        int i;
        int i2;
        int i3 = WhenMappings.$EnumSwitchMapping$0[layout.getAxis().ordinal()];
        if (i3 == 1) {
            i = 1;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        setOrientation(i);
        int i4 = WhenMappings.$EnumSwitchMapping$1[layout.getGravity().ordinal()];
        if (i4 == 1) {
            i2 = 8388611;
        } else if (i4 == 2) {
            i2 = 8388613;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 17;
        }
        setGravity(i2);
    }

    private final void setChildLayout(ApiSdAxis listAxis, ApiSdFlexibleComponent.Layout childLayout, View childView) {
        Tuples2<Integer, Integer> childComponentLayout = ViewLayoutUtils2.getChildComponentLayout(childLayout.getStrategy(), listAxis);
        int iIntValue = childComponentLayout.component1().intValue();
        int iIntValue2 = childComponentLayout.component2().intValue();
        childView.getLayoutParams().width = iIntValue;
        childView.getLayoutParams().height = iIntValue2;
        if (childView instanceof SdInformationalRow) {
            ViewLayoutUtils2.updateInsetsUsingPadding(childView, childLayout.getInsets());
        } else {
            ViewLayoutUtils2.updateInsetsUsingMargin(childView, childLayout.getInsets());
        }
        ViewLayoutUtils2.setSdGravity(childView, childLayout.getGravity());
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout
    protected void doBeforeAddingChildren() {
        super.doBeforeAddingChildren();
        removeAllViews();
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout, android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(this.listLayout, onSaveState(super.onSaveInstanceState()));
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdLinearLayout, android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdFlexibleComponentListLayout.SavedState");
        SavedState savedState = (SavedState) state;
        setListLayout(savedState.getLayout());
        super.onRestoreInstanceState(onRestoreState(savedState.getSuperState()));
    }

    public final void toggleButtonLoading(boolean loading) {
        Object obj;
        Sequence<SdBaseButtonView> sequenceFilter = SequencesKt.filter(ViewGroup2.getChildren(this), new Function1<Object, Boolean>() { // from class: com.robinhood.android.odyssey.lib.view.SdFlexibleComponentListLayout$toggleButtonLoading$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj2) {
                return Boolean.valueOf(obj2 instanceof SdBaseButtonView);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        if (!loading) {
            for (SdBaseButtonView sdBaseButtonView : sequenceFilter) {
                if (sdBaseButtonView instanceof SdButton) {
                    ((SdButton) sdBaseButtonView).setLoading(false);
                }
                if (!sdBaseButtonView.isButtonDataDisabled()) {
                    sdBaseButtonView.requireSdView().setEnabled(true);
                }
            }
            return;
        }
        Iterator it = sequenceFilter.iterator2();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                LocalDateTime lastClickTime = ((SdBaseButtonView) next).getLastClickTime();
                do {
                    Object next2 = it.next();
                    LocalDateTime lastClickTime2 = ((SdBaseButtonView) next2).getLastClickTime();
                    if (lastClickTime.compareTo(lastClickTime2) < 0) {
                        next = next2;
                        lastClickTime = lastClickTime2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        SdBaseButtonView sdBaseButtonView2 = (SdBaseButtonView) obj;
        for (SdBaseButtonView sdBaseButtonView3 : sequenceFilter) {
            if (Intrinsics.areEqual(sdBaseButtonView2, sdBaseButtonView3) && (sdBaseButtonView3 instanceof SdButton)) {
                ((SdButton) sdBaseButtonView3).setLoading(true);
            } else {
                sdBaseButtonView3.requireSdView().setEnabled(false);
            }
        }
    }

    /* compiled from: SdFlexibleComponentListLayout.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdFlexibleComponentListLayout$SavedState;", "Landroid/view/AbsSavedState;", "layout", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList$ListLayout;", "inSuperState", "Landroid/os/Parcelable;", "<init>", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList$ListLayout;Landroid/os/Parcelable;)V", "getLayout", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdGenericComponentList$ListLayout;", "getInSuperState", "()Landroid/os/Parcelable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SavedState extends AbsSavedState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final Parcelable inSuperState;
        private final ApiSdGenericComponentList.ListLayout layout;

        /* compiled from: SdFlexibleComponentListLayout.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState((ApiSdGenericComponentList.ListLayout) parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public static /* synthetic */ SavedState copy$default(SavedState savedState, ApiSdGenericComponentList.ListLayout listLayout, Parcelable parcelable, int i, Object obj) {
            if ((i & 1) != 0) {
                listLayout = savedState.layout;
            }
            if ((i & 2) != 0) {
                parcelable = savedState.inSuperState;
            }
            return savedState.copy(listLayout, parcelable);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSdGenericComponentList.ListLayout getLayout() {
            return this.layout;
        }

        /* renamed from: component2, reason: from getter */
        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public final SavedState copy(ApiSdGenericComponentList.ListLayout layout, Parcelable inSuperState) {
            return new SavedState(layout, inSuperState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.layout, savedState.layout) && Intrinsics.areEqual(this.inSuperState, savedState.inSuperState);
        }

        public int hashCode() {
            ApiSdGenericComponentList.ListLayout listLayout = this.layout;
            int iHashCode = (listLayout == null ? 0 : listLayout.hashCode()) * 31;
            Parcelable parcelable = this.inSuperState;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        public String toString() {
            return "SavedState(layout=" + this.layout + ", inSuperState=" + this.inSuperState + ")";
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.layout, flags);
            dest.writeParcelable(this.inSuperState, flags);
        }

        public final ApiSdGenericComponentList.ListLayout getLayout() {
            return this.layout;
        }

        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public SavedState(ApiSdGenericComponentList.ListLayout listLayout, Parcelable parcelable) {
            super(parcelable);
            this.layout = listLayout;
            this.inSuperState = parcelable;
        }
    }
}
