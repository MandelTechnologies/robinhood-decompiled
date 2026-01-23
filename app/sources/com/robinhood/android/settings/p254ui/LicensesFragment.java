package com.robinhood.android.settings.p254ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RdsUnderlineSpan;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.settings.C28315R;
import com.robinhood.android.settings.databinding.FragmentLicensesBinding;
import com.robinhood.android.settings.p254ui.LicensesFragment;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.settings.contracts.LicensesKey;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.squareup.moshi.JsonAdapter;
import dispatch.core.Suspend;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: LicensesFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/LicensesFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "setMoshi", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "dependencyListJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/android/settings/ui/LicensesFragment$DependencyEntry;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "binding", "Lcom/robinhood/android/settings/databinding/FragmentLicensesBinding;", "getBinding", "()Lcom/robinhood/android/settings/databinding/FragmentLicensesBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "DependencyEntry", "Companion", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class LicensesFragment extends BaseFragment {
    public static final String ASSET_FILE_NAME = "licenses.json";
    private final GenericListAdapter<RdsRowView, DependencyEntry> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private JsonAdapter<List<DependencyEntry>> dependencyListJsonAdapter;
    public LazyMoshi moshi;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LicensesFragment.class, "binding", "getBinding()Lcom/robinhood/android/settings/databinding/FragmentLicensesBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public LicensesFragment() {
        super(C28315R.layout.fragment_licenses);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, LicensesFragment2.INSTANCE);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.settings.ui.LicensesFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LicensesFragment.adapter$lambda$4(this.f$0, (RdsRowView) obj, (LicensesFragment.DependencyEntry) obj2);
            }
        });
    }

    public final LazyMoshi getMoshi() {
        LazyMoshi lazyMoshi = this.moshi;
        if (lazyMoshi != null) {
            return lazyMoshi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("moshi");
        return null;
    }

    public final void setMoshi(LazyMoshi lazyMoshi) {
        Intrinsics.checkNotNullParameter(lazyMoshi, "<set-?>");
        this.moshi = lazyMoshi;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final FragmentLicensesBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentLicensesBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$4(LicensesFragment licensesFragment, final RdsRowView of, DependencyEntry entry) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(entry, "entry");
        final HttpUrl licenseUrl = entry.getLicenseUrl();
        final HttpUrl url = entry.getUrl();
        if (url == null) {
            url = licenseUrl;
        }
        of.setPrimaryText(entry.getName());
        of.setSecondaryText(entry.getCopyrightHolder());
        if (licenseUrl != null && !Intrinsics.areEqual(licenseUrl, url)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Resources resources = of.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            RdsUnderlineSpan rdsUnderlineSpan = new RdsUnderlineSpan(resources, false, 2, null);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) licensesFragment.getString(C28315R.string.settings_licenses_attribution_license_link_label));
            spannableStringBuilder.setSpan(rdsUnderlineSpan, length, spannableStringBuilder.length(), 17);
            of.setMetadataPrimaryText(new SpannedString(spannableStringBuilder));
            of.onPrimaryMetadataClick(new Function0() { // from class: com.robinhood.android.settings.ui.LicensesFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LicensesFragment.adapter$lambda$4$lambda$2(of, licenseUrl);
                }
            });
        } else {
            of.setMetadataPrimaryText(null);
            of.onPrimaryMetadataClick(null);
        }
        if (url == null) {
            OnClickListeners.onClick(of, null);
        } else {
            OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.settings.ui.LicensesFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LicensesFragment.adapter$lambda$4$lambda$3(of, url);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$4$lambda$2(RdsRowView rdsRowView, HttpUrl httpUrl) {
        WebUtils webUtils = WebUtils.INSTANCE;
        Context context = rdsRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WebUtils.viewUrl$default(webUtils, context, httpUrl, 0, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$4$lambda$3(RdsRowView rdsRowView, HttpUrl httpUrl) {
        WebUtils webUtils = WebUtils.INSTANCE;
        Context context = rdsRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        WebUtils.viewUrl$default(webUtils, context, httpUrl, 0, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LazyMoshi moshi = getMoshi();
        Types types = Types.INSTANCE;
        this.dependencyListJsonAdapter = moshi.adapter(new TypeToken<List<? extends DependencyEntry>>() { // from class: com.robinhood.android.settings.ui.LicensesFragment$onAttach$$inlined$getAdapter$1
        }.getType());
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().launchWhenCreated(new C283551(null));
    }

    /* compiled from: LicensesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.settings.ui.LicensesFragment$onCreate$1", m3645f = "LicensesFragment.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.settings.ui.LicensesFragment$onCreate$1 */
    static final class C283551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C283551(Continuation<? super C283551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LicensesFragment.this.new C283551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C283551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LicensesFragment3 licensesFragment3 = new LicensesFragment3(LicensesFragment.this, null);
                this.label = 1;
                obj = Suspend.withIO$default(null, licensesFragment3, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LicensesFragment.this.adapter.submitList((List) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().recyclerView.setAdapter(this.adapter);
        getBinding().recyclerView.setHasFixedSize(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C28315R.string.settings_licenses_attribution_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LicensesFragment.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/LicensesFragment$DependencyEntry;", "", "name", "", "copyrightHolder", "url", "Lokhttp3/HttpUrl;", "licenseUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)V", "getName", "()Ljava/lang/String;", "getCopyrightHolder", "getUrl", "()Lokhttp3/HttpUrl;", "getLicenseUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class DependencyEntry {
        private final String copyrightHolder;
        private final HttpUrl licenseUrl;
        private final String name;
        private final HttpUrl url;

        public static /* synthetic */ DependencyEntry copy$default(DependencyEntry dependencyEntry, String str, String str2, HttpUrl httpUrl, HttpUrl httpUrl2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dependencyEntry.name;
            }
            if ((i & 2) != 0) {
                str2 = dependencyEntry.copyrightHolder;
            }
            if ((i & 4) != 0) {
                httpUrl = dependencyEntry.url;
            }
            if ((i & 8) != 0) {
                httpUrl2 = dependencyEntry.licenseUrl;
            }
            return dependencyEntry.copy(str, str2, httpUrl, httpUrl2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCopyrightHolder() {
            return this.copyrightHolder;
        }

        /* renamed from: component3, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        /* renamed from: component4, reason: from getter */
        public final HttpUrl getLicenseUrl() {
            return this.licenseUrl;
        }

        public final DependencyEntry copy(String name, String copyrightHolder, HttpUrl url, HttpUrl licenseUrl) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(copyrightHolder, "copyrightHolder");
            return new DependencyEntry(name, copyrightHolder, url, licenseUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DependencyEntry)) {
                return false;
            }
            DependencyEntry dependencyEntry = (DependencyEntry) other;
            return Intrinsics.areEqual(this.name, dependencyEntry.name) && Intrinsics.areEqual(this.copyrightHolder, dependencyEntry.copyrightHolder) && Intrinsics.areEqual(this.url, dependencyEntry.url) && Intrinsics.areEqual(this.licenseUrl, dependencyEntry.licenseUrl);
        }

        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + this.copyrightHolder.hashCode()) * 31;
            HttpUrl httpUrl = this.url;
            int iHashCode2 = (iHashCode + (httpUrl == null ? 0 : httpUrl.hashCode())) * 31;
            HttpUrl httpUrl2 = this.licenseUrl;
            return iHashCode2 + (httpUrl2 != null ? httpUrl2.hashCode() : 0);
        }

        public String toString() {
            return "DependencyEntry(name=" + this.name + ", copyrightHolder=" + this.copyrightHolder + ", url=" + this.url + ", licenseUrl=" + this.licenseUrl + ")";
        }

        public DependencyEntry(String name, String copyrightHolder, HttpUrl httpUrl, HttpUrl httpUrl2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(copyrightHolder, "copyrightHolder");
            this.name = name;
            this.copyrightHolder = copyrightHolder;
            this.url = httpUrl;
            this.licenseUrl = httpUrl2;
        }

        public final String getName() {
            return this.name;
        }

        public final String getCopyrightHolder() {
            return this.copyrightHolder;
        }

        public final HttpUrl getUrl() {
            return this.url;
        }

        public final HttpUrl getLicenseUrl() {
            return this.licenseUrl;
        }
    }

    /* compiled from: LicensesFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/LicensesFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/settings/contracts/LicensesKey;", "<init>", "()V", "ASSET_FILE_NAME", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "newInstance", "Lcom/robinhood/android/settings/ui/LicensesFragment;", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LicensesKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LicensesKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance();
        }

        private final LicensesFragment newInstance() {
            return new LicensesFragment();
        }
    }
}
