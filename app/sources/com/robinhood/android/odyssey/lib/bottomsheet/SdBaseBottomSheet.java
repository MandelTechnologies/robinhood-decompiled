package com.robinhood.android.odyssey.lib.bottomsheet;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.odyssey.lib.SdLoggingUtil;
import com.robinhood.models.api.serverdrivenui.bottomsheet.ApiSdActionListBottomSheet;
import com.robinhood.models.api.serverdrivenui.bottomsheet.ApiSdBaseBottomSheet;
import com.robinhood.models.api.serverdrivenui.bottomsheet.ApiSdInformationalListBottomSheet;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: SdBaseBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b'\u0018\u0000 /*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004:\u0002./B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0002\u0010#R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00028\u00008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0016\u0010,\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet;", "T", "Lcom/robinhood/models/api/serverdrivenui/bottomsheet/ApiSdBaseBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "layoutRes", "", "<init>", "(I)V", "callbacks", "Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", WebsocketGatewayConstants.DATA_KEY, "getData", "()Lcom/robinhood/models/api/serverdrivenui/bottomsheet/ApiSdBaseBottomSheet;", "data$delegate", "Lkotlin/Lazy;", "<set-?>", "", "isBounded", "()Z", "setBounded", "(Z)V", "isBounded$delegate", "Lkotlin/properties/ReadWriteProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "(Lcom/robinhood/models/api/serverdrivenui/bottomsheet/ApiSdBaseBottomSheet;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "screenSource", "getScreenSource", "screenTag", "getScreenTag", "Callbacks", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class SdBaseBottomSheet<T extends ApiSdBaseBottomSheet> extends BaseBottomSheetDialogFragment implements UiCallbacks.ScreenViewAnalyticable {
    private static final String ARG_BOTTOM_SHEET_DATA = "bottomSheetData";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: data$delegate, reason: from kotlin metadata */
    private final Lazy data;

    /* renamed from: isBounded$delegate, reason: from kotlin metadata */
    private final Interfaces3 isBounded;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdBaseBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SdBaseBottomSheet.class, "isBounded", "isBounded()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdBaseBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet$Callbacks;", "", "odysseyFlowId", "", "getOdysseyFlowId", "()Ljava/lang/String;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        String getOdysseyFlowId();
    }

    public abstract void bind(T data);

    public SdBaseBottomSheet(int i) {
        super(i);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.odyssey.lib.bottomsheet.SdBaseBottomSheet$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.data = Fragments2.argument(this, ARG_BOTTOM_SHEET_DATA);
        this.isBounded = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[1]);
    }

    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    protected final T getData() {
        return (T) this.data.getValue();
    }

    private final boolean isBounded() {
        return ((Boolean) this.isBounded.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setBounded(boolean z) {
        this.isBounded.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (isBounded()) {
            return;
        }
        bind((SdBaseBottomSheet<T>) getData());
        setBounded(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return SdLoggingUtil.getScreenName(getData());
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return SdLoggingUtil.getScreenDescription(getData());
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return Fragments2.getBaseActivity(this).getScreenSource();
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return SdLoggingUtil.getScreenTag(this);
    }

    /* compiled from: SdBaseBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet$Companion;", "", "<init>", "()V", "ARG_BOTTOM_SHEET_DATA", "", "show", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "bottomSheet", "Lcom/robinhood/models/api/serverdrivenui/bottomsheet/ApiSdBaseBottomSheet;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void show(FragmentManager childFragmentManager, ApiSdBaseBottomSheet bottomSheet) {
            DialogFragment sdInformationalListBottomSheet;
            Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (bottomSheet instanceof ApiSdActionListBottomSheet) {
                sdInformationalListBottomSheet = new SdActionListBottomSheet();
            } else {
                if (!(bottomSheet instanceof ApiSdInformationalListBottomSheet)) {
                    Preconditions.INSTANCE.failUnexpectedItemKotlin(bottomSheet);
                    throw new ExceptionsH();
                }
                sdInformationalListBottomSheet = new SdInformationalListBottomSheet();
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(SdBaseBottomSheet.ARG_BOTTOM_SHEET_DATA, bottomSheet);
            sdInformationalListBottomSheet.setArguments(bundle);
            sdInformationalListBottomSheet.show(childFragmentManager, bottomSheet.getId());
        }
    }
}
