package com.robinhood.android.odyssey.lib.legacybottomsheet;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.models.api.serverdrivenui.component.ApiSdOption;
import com.robinhood.utils.extensions.Bundles;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdDropdownSelectBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/legacybottomsheet/SdDropdownSelectBottomSheet;", "Lcom/robinhood/android/odyssey/lib/legacybottomsheet/BaseSdListBottomSheet;", "<init>", "()V", SdDropdownSelectBottomSheet.ARG_TARGET_COMPONENT_TAG, "", "getTargetComponentTag", "()Ljava/lang/String;", "targetComponentTag$delegate", "Lkotlin/Lazy;", "options", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "getOptions", "()Ljava/util/List;", "options$delegate", "callbacks", "Lcom/robinhood/android/odyssey/lib/legacybottomsheet/SdDropdownSelectBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/odyssey/lib/legacybottomsheet/SdDropdownSelectBottomSheet$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "configBottomSheet", "", "Callbacks", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdDropdownSelectBottomSheet extends BaseSdListBottomSheet {
    private static final String ARG_SD_OPTIONS = "sdOptions";
    private static final String ARG_TARGET_COMPONENT_TAG = "targetComponentTag";
    private final GenericListAdapter<RdsRowView, ApiSdOption> adapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: options$delegate, reason: from kotlin metadata */
    private final Lazy options;

    /* renamed from: targetComponentTag$delegate, reason: from kotlin metadata */
    private final Lazy targetComponentTag;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdDropdownSelectBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/odyssey/lib/legacybottomsheet/SdDropdownSelectBottomSheet$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdDropdownSelectBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/legacybottomsheet/SdDropdownSelectBottomSheet$Callbacks;", "", "onDropdownSelect", "", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", SdDropdownSelectBottomSheet.ARG_TARGET_COMPONENT_TAG, "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDropdownSelect(ApiSdOption option, String targetComponentTag);
    }

    public SdDropdownSelectBottomSheet() {
        super(false);
        this.targetComponentTag = Fragments2.argument(this, ARG_TARGET_COMPONENT_TAG);
        this.options = Fragments2.argument(this, ARG_SD_OPTIONS);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.odyssey.lib.legacybottomsheet.SdDropdownSelectBottomSheet$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C20335R.layout.row_bottomsheet_list;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2985of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.odyssey.lib.legacybottomsheet.SdDropdownSelectBottomSheet$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SdDropdownSelectBottomSheet.adapter$lambda$1(this.f$0, (RdsRowView) obj, (ApiSdOption) obj2);
            }
        });
    }

    private final String getTargetComponentTag() {
        return (String) this.targetComponentTag.getValue();
    }

    private final List<ApiSdOption> getOptions() {
        return (List) this.options.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final SdDropdownSelectBottomSheet sdDropdownSelectBottomSheet, RdsRowView of, final ApiSdOption option) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(option, "option");
        RdsRowView.bind$default(of, option.getDisplay_label(), option.getDescription(), null, null, option.getBadge_text(), 12, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.odyssey.lib.legacybottomsheet.SdDropdownSelectBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SdDropdownSelectBottomSheet.adapter$lambda$1$lambda$0(this.f$0, option);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(SdDropdownSelectBottomSheet sdDropdownSelectBottomSheet, ApiSdOption apiSdOption) {
        sdDropdownSelectBottomSheet.getCallbacks().onDropdownSelect(apiSdOption, sdDropdownSelectBottomSheet.getTargetComponentTag());
        sdDropdownSelectBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.odyssey.lib.legacybottomsheet.BaseSdListBottomSheet
    protected void configBottomSheet() {
        bindAdapter(getRecyclerView(), this.adapter);
        this.adapter.submitList(getOptions());
    }

    /* compiled from: SdDropdownSelectBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/legacybottomsheet/SdDropdownSelectBottomSheet$Companion;", "", "<init>", "()V", "ARG_TARGET_COMPONENT_TAG", "", "ARG_SD_OPTIONS", "newInstance", "Lcom/robinhood/android/odyssey/lib/legacybottomsheet/SdDropdownSelectBottomSheet;", SdDropdownSelectBottomSheet.ARG_TARGET_COMPONENT_TAG, "options", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdOption;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SdDropdownSelectBottomSheet newInstance(String targetComponentTag, List<ApiSdOption> options) {
            Intrinsics.checkNotNullParameter(targetComponentTag, "targetComponentTag");
            Intrinsics.checkNotNullParameter(options, "options");
            SdDropdownSelectBottomSheet sdDropdownSelectBottomSheet = new SdDropdownSelectBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putString(SdDropdownSelectBottomSheet.ARG_TARGET_COMPONENT_TAG, targetComponentTag);
            Bundles.putParcelableList(bundle, SdDropdownSelectBottomSheet.ARG_SD_OPTIONS, options);
            sdDropdownSelectBottomSheet.setArguments(bundle);
            return sdDropdownSelectBottomSheet;
        }
    }
}
