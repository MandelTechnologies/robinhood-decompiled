package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewGroup2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.odyssey.lib.utils.MergePropertiesValues;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdListOptionsComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.AlwaysScrollToTopLayoutEnforcer;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: SdListOptionsView.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020%J\b\u0010*\u001a\u00020+H\u0014J\u0012\u0010,\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010+H\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdListOptionsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;", "setData", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdListOptionsComponent$Data$ListOption;)V", "fullOptions", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "selectedOption", "layoutEnforcer", "Lcom/robinhood/utils/ui/view/recyclerview/AlwaysScrollToTopLayoutEnforcer;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "onFinishInflate", "", "mergeNewData", "newData", "onDataUpdated", "updateSource", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$UpdateSource;", "onSubmitValue", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "setClickable", "clickable", "", "filterOptions", "prefix", "", "ignoreCase", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdListOptionsView extends RecyclerView implements SdBaseView<ApiSdListOptionsComponent, ApiSdListOptionsComponent.Data.ListOption, SdBaseView.Callbacks> {
    public static final int $stable = 8;
    private final GenericListAdapter<RdsRowView, ApiSdOption> adapter;
    private ApiSdListOptionsComponent.Data.ListOption data;
    private List<ApiSdOption> fullOptions;
    private final AlwaysScrollToTopLayoutEnforcer layoutEnforcer;
    private ApiSdOption selectedOption;

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void bind(ApiSdListOptionsComponent apiSdListOptionsComponent) {
        SdBaseView.DefaultImpls.bind(this, apiSdListOptionsComponent);
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
    public void update(ApiSdListOptionsComponent.Data.ListOption listOption, SdBaseView.UpdateSource updateSource) {
        SdBaseView.DefaultImpls.update(this, listOption, updateSource);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdListOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.fullOptions = CollectionsKt.emptyList();
        AlwaysScrollToTopLayoutEnforcer alwaysScrollToTopLayoutEnforcer = new AlwaysScrollToTopLayoutEnforcer();
        this.layoutEnforcer = alwaysScrollToTopLayoutEnforcer;
        GenericListAdapter<RdsRowView, ApiSdOption> genericListAdapterM2985of = GenericListAdapter.INSTANCE.m2985of(C20335R.layout.row_sd_select_option_list, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.odyssey.lib.view.SdListOptionsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SdListOptionsView.adapter$lambda$2(this.f$0, (RdsRowView) obj, (ApiSdOption) obj2);
            }
        });
        genericListAdapterM2985of.registerAdapterDataObserver(alwaysScrollToTopLayoutEnforcer);
        this.adapter = genericListAdapterM2985of;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdListOptionsComponent.Data.ListOption getData() {
        return this.data;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void setData(ApiSdListOptionsComponent.Data.ListOption listOption) {
        this.data = listOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final SdListOptionsView sdListOptionsView, RdsRowView of, final ApiSdOption option) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(option, "option");
        RdsRowView.bind$default(of, option.getDisplay_label(), option.getDescription(), null, null, option.getBadge_text(), 12, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdListOptionsView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdListOptionsView.adapter$lambda$2$lambda$1(this.f$0, option);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(SdListOptionsView sdListOptionsView, ApiSdOption apiSdOption) {
        sdListOptionsView.selectedOption = apiSdOption;
        ApiSdListOptionsComponent.Data.ListOption data = sdListOptionsView.getData();
        if (data == null) {
            return Unit.INSTANCE;
        }
        ApiSdAction on_click = data.getOn_click();
        if (on_click != null) {
            sdListOptionsView.requireComponentCallbacks().onComponentAction(data.getId(), on_click);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.layoutEnforcer.setRecyclerView(this);
        setLayoutManager(new LinearLayoutManager(getContext()));
        setAdapter(this.adapter);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdListOptionsComponent.Data.ListOption mergeNewData(ApiSdListOptionsComponent.Data.ListOption newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        return (ApiSdListOptionsComponent.Data.ListOption) MergePropertiesValues.mergePropertiesValues(getData(), Reflection.getOrCreateKotlinClass(ApiSdListOptionsComponent.Data.ListOption.class), newData);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public void onDataUpdated(ApiSdListOptionsComponent.Data.ListOption newData, SdBaseView.UpdateSource updateSource) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        Intrinsics.checkNotNullParameter(updateSource, "updateSource");
        SdBaseView.DefaultImpls.onDataUpdated(this, newData, updateSource);
        List<ApiSdOption> options = newData.getOptions();
        if (options != null) {
            this.fullOptions = options;
            this.adapter.submitList(options);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView
    public ApiSdTypedValue onSubmitValue() {
        ApiSdOption apiSdOption = this.selectedOption;
        Intrinsics.checkNotNull(apiSdOption);
        return apiSdOption.getTyped_value_object();
    }

    @Override // android.view.View
    public void setClickable(boolean clickable) {
        Iterator<View> it = ViewGroup2.getChildren(this).iterator2();
        while (it.hasNext()) {
            it.next().setClickable(clickable);
        }
        super.setClickable(clickable);
    }

    public static /* synthetic */ void filterOptions$default(SdListOptionsView sdListOptionsView, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        sdListOptionsView.filterOptions(charSequence, z);
    }

    public final void filterOptions(CharSequence prefix, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        GenericListAdapter<RdsRowView, ApiSdOption> genericListAdapter = this.adapter;
        List<ApiSdOption> list = this.fullOptions;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.startsWith(((ApiSdOption) obj).getDisplay_label(), prefix, ignoreCase)) {
                arrayList.add(obj);
            }
        }
        genericListAdapter.submitList(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected Parcelable onSaveInstanceState() {
        return onSaveState(super.onSaveInstanceState());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(onRestoreState(state));
    }
}
