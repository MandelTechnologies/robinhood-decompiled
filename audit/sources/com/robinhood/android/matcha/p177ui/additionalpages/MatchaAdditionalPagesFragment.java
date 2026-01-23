package com.robinhood.android.matcha.p177ui.additionalpages;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.matcha.p177ui.additionalpages.MatchaAdditionalPageFragment;
import com.robinhood.android.models.matcha.api.MatchaAdditionalPage;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.social.contracts.matcha.MatchaAdditionalPagesKey;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MatchaAdditionalPagesFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPagesFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPageFragment$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPagesFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPagesFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "pages", "", "Lcom/robinhood/android/models/matcha/api/MatchaAdditionalPage;", "getPages", "()Ljava/util/List;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "dismiss", "page", "Callbacks", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaAdditionalPagesFragment extends BaseFragment implements MatchaAdditionalPageFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaAdditionalPagesFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPagesFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaAdditionalPagesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPagesFragment$Callbacks;", "", "onDoneClicked", "", "postPageKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDoneClicked(FragmentKey postPageKey);
    }

    public MatchaAdditionalPagesFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matcha.ui.additionalpages.MatchaAdditionalPagesFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final List<MatchaAdditionalPage> getPages() {
        return ((MatchaAdditionalPagesKey) INSTANCE.getArgs((Fragment) this)).getPages().getPages();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getPages().isEmpty();
            setFragment(C11048R.id.fragment_container, MatchaAdditionalPageFragment.INSTANCE.newInstance((Parcelable) CollectionsKt.first((List) getPages())));
        }
    }

    @Override // com.robinhood.android.matcha.ui.additionalpages.MatchaAdditionalPageFragment.Callbacks
    public void dismiss(MatchaAdditionalPage page) {
        Intrinsics.checkNotNullParameter(page, "page");
        int iIndexOf = getPages().indexOf(page);
        if (iIndexOf == CollectionsKt.getLastIndex(getPages())) {
            getCallbacks().onDoneClicked(null);
        } else {
            replaceFragment(MatchaAdditionalPageFragment.INSTANCE.newInstance((Parcelable) getPages().get(iIndexOf + 1)));
        }
    }

    /* compiled from: MatchaAdditionalPagesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPagesFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/additionalpages/MatchaAdditionalPagesFragment;", "Lcom/robinhood/android/social/contracts/matcha/MatchaAdditionalPagesKey;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MatchaAdditionalPagesFragment, MatchaAdditionalPagesKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MatchaAdditionalPagesKey matchaAdditionalPagesKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, matchaAdditionalPagesKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MatchaAdditionalPagesKey getArgs(MatchaAdditionalPagesFragment matchaAdditionalPagesFragment) {
            return (MatchaAdditionalPagesKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, matchaAdditionalPagesFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaAdditionalPagesFragment newInstance(MatchaAdditionalPagesKey matchaAdditionalPagesKey) {
            return (MatchaAdditionalPagesFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, matchaAdditionalPagesKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaAdditionalPagesFragment matchaAdditionalPagesFragment, MatchaAdditionalPagesKey matchaAdditionalPagesKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, matchaAdditionalPagesFragment, matchaAdditionalPagesKey);
        }
    }
}
