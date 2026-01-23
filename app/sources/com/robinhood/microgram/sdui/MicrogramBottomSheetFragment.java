package com.robinhood.microgram.sdui;

import androidx.fragment.app.Fragment;
import com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MicrogramBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramBottomSheetFragment;", "Lcom/robinhood/android/microgramsdui/BaseMicrogramBottomSheetFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/microgram/sdui/MicrogramAppUtils;", "getCallbacks", "()Lcom/robinhood/microgram/sdui/MicrogramAppUtils;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "instance", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "getInstance", "()Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "Companion", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class MicrogramBottomSheetFragment extends BaseMicrogramBottomSheetFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(MicrogramAppUtils.class), new Function1<Fragment, Object>() { // from class: com.robinhood.microgram.sdui.MicrogramBottomSheetFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MicrogramBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/microgram/sdui/MicrogramAppUtils;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private final MicrogramAppUtils getCallbacks() {
        return (MicrogramAppUtils) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment
    public MicrogramManager2 getInstance() {
        return getCallbacks().getInstance();
    }

    @Override // com.robinhood.android.microgramsdui.BaseMicrogramBottomSheetFragment
    public String getIdentifier() {
        return ((IdentifierArgs) INSTANCE.getArgs((Fragment) this)).getIdentifier();
    }

    /* compiled from: MicrogramBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/MicrogramBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/microgram/sdui/MicrogramBottomSheetFragment;", "Lcom/robinhood/microgram/sdui/IdentifierArgs;", "<init>", "()V", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MicrogramBottomSheetFragment, IdentifierArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public IdentifierArgs getArgs(MicrogramBottomSheetFragment microgramBottomSheetFragment) {
            return (IdentifierArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, microgramBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MicrogramBottomSheetFragment newInstance(IdentifierArgs identifierArgs) {
            return (MicrogramBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, identifierArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MicrogramBottomSheetFragment microgramBottomSheetFragment, IdentifierArgs identifierArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, microgramBottomSheetFragment, identifierArgs);
        }
    }
}
