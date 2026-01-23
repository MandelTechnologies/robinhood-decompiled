package com.robinhood.android.common.p088ui.reference;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.AnalyticsTabOnPageChangeListener;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.ReferenceManual;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.Markwon;
import io.noties.markwon.core.MarkwonTheme;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Supervisor3;

/* compiled from: ReferenceManualActivity.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002@AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00107\u001a\u000208H\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\u0010\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\t\u001a\u0004\b.\u0010/R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "referenceManualKey", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "getReferenceManualKey", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "referenceManualKey$delegate", "Lkotlin/Lazy;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "getViewPager", "()Landroidx/viewpager/widget/ViewPager;", "viewPager$delegate", "Lkotlin/properties/ReadOnlyProperty;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "tabLayout$delegate", "errorText", "Landroid/widget/TextView;", "getErrorText", "()Landroid/widget/TextView;", "errorText$delegate", "contentRenderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "getContentRenderer", "()Lcom/robinhood/contentful/markdown/ContentRenderer;", "setContentRenderer", "(Lcom/robinhood/contentful/markdown/ContentRenderer;)V", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "getStaticContentStore", "()Lcom/robinhood/contentful/StaticContentStore;", "setStaticContentStore", "(Lcom/robinhood/contentful/StaticContentStore;)V", "markwonBuilder", "Lio/noties/markwon/Markwon$Builder;", "getMarkwonBuilder", "()Lio/noties/markwon/Markwon$Builder;", "setMarkwonBuilder", "(Lio/noties/markwon/Markwon$Builder;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "markwon$delegate", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Adapter", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ReferenceManualActivity extends BaseActivity {
    private static final String EXTRA_REFERENCE_MANUAL = "referenceManual";
    public AnalyticsLogger analytics;
    public ContentRenderer contentRenderer;

    /* renamed from: errorText$delegate, reason: from kotlin metadata */
    private final Interfaces2 errorText;

    /* renamed from: markwon$delegate, reason: from kotlin metadata */
    private final Lazy markwon;
    public Markwon.Builder markwonBuilder;

    /* renamed from: referenceManualKey$delegate, reason: from kotlin metadata */
    private final Lazy referenceManualKey;
    public StaticContentStore staticContentStore;

    /* renamed from: tabLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 tabLayout;

    /* renamed from: viewPager$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewPager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReferenceManualActivity.class, "viewPager", "getViewPager()Landroidx/viewpager/widget/ViewPager;", 0)), Reflection.property1(new PropertyReference1Impl(ReferenceManualActivity.class, "tabLayout", "getTabLayout()Lcom/google/android/material/tabs/TabLayout;", 0)), Reflection.property1(new PropertyReference1Impl(ReferenceManualActivity.class, "errorText", "getErrorText()Landroid/widget/TextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return false;
    }

    public ReferenceManualActivity() {
        super(C11048R.layout.activity_reference_manual);
        this.referenceManualKey = Activity.intentExtra(this, EXTRA_REFERENCE_MANUAL);
        this.viewPager = bindView(C11048R.id.viewpager);
        this.tabLayout = bindView(C11048R.id.tab_layout);
        this.errorText = bindView(C11048R.id.error_txt);
        this.markwon = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.ui.reference.ReferenceManualActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReferenceManualActivity.markwon_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegacyIntentKey.ReferenceManual getReferenceManualKey() {
        return (LegacyIntentKey.ReferenceManual) this.referenceManualKey.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewPager getViewPager() {
        return (ViewPager) this.viewPager.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TabLayout getTabLayout() {
        return (TabLayout) this.tabLayout.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getErrorText() {
        return (TextView) this.errorText.getValue(this, $$delegatedProperties[2]);
    }

    public final ContentRenderer getContentRenderer() {
        ContentRenderer contentRenderer = this.contentRenderer;
        if (contentRenderer != null) {
            return contentRenderer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contentRenderer");
        return null;
    }

    public final void setContentRenderer(ContentRenderer contentRenderer) {
        Intrinsics.checkNotNullParameter(contentRenderer, "<set-?>");
        this.contentRenderer = contentRenderer;
    }

    public final StaticContentStore getStaticContentStore() {
        StaticContentStore staticContentStore = this.staticContentStore;
        if (staticContentStore != null) {
            return staticContentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("staticContentStore");
        return null;
    }

    public final void setStaticContentStore(StaticContentStore staticContentStore) {
        Intrinsics.checkNotNullParameter(staticContentStore, "<set-?>");
        this.staticContentStore = staticContentStore;
    }

    public final Markwon.Builder getMarkwonBuilder() {
        Markwon.Builder builder = this.markwonBuilder;
        if (builder != null) {
            return builder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwonBuilder");
        return null;
    }

    public final void setMarkwonBuilder(Markwon.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<set-?>");
        this.markwonBuilder = builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Markwon getMarkwon() {
        return (Markwon) this.markwon.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Markwon markwon_delegate$lambda$0(final ReferenceManualActivity referenceManualActivity) {
        Markwon markwonBuild = referenceManualActivity.getMarkwonBuilder().usePlugin(new AbstractMarkwonPlugin() { // from class: com.robinhood.android.common.ui.reference.ReferenceManualActivity$markwon$2$1
            @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
            public void configureTheme(MarkwonTheme.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.bulletWidth(this.this$0.getResources().getDimensionPixelSize(C11048R.dimen.bullet_diameter));
            }
        }).build();
        Intrinsics.checkNotNullExpressionValue(markwonBuild, "build(...)");
        return markwonBuild;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        getTabLayout().setVisibility(8);
        rhToolbar.setLoadingViewVisible(true);
        getLifecycleScope().launchWhenStarted(new C118561(rhToolbar, this, null));
    }

    /* compiled from: ReferenceManualActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.ui.reference.ReferenceManualActivity$onCreate$1", m3645f = "ReferenceManualActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.ui.reference.ReferenceManualActivity$onCreate$1 */
    static final class C118561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RhToolbar $toolbar;
        int label;
        final /* synthetic */ ReferenceManualActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C118561(RhToolbar rhToolbar, ReferenceManualActivity referenceManualActivity, Continuation<? super C118561> continuation) {
            super(2, continuation);
            this.$toolbar = rhToolbar;
            this.this$0 = referenceManualActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C118561(this.$toolbar, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C118561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$toolbar, null);
                    this.label = 1;
                    if (Supervisor3.supervisorScope(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (IOException unused) {
                this.$toolbar.setLoadingViewVisible(false);
                this.this$0.getViewPager().setVisibility(8);
                this.this$0.getErrorText().setVisibility(0);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ReferenceManualActivity.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.ui.reference.ReferenceManualActivity$onCreate$1$1", m3645f = "ReferenceManualActivity.kt", m3646l = {73, 79, 93}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.common.ui.reference.ReferenceManualActivity$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ RhToolbar $toolbar;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ ReferenceManualActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReferenceManualActivity referenceManualActivity, RhToolbar rhToolbar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = referenceManualActivity;
                this.$toolbar = rhToolbar;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$toolbar, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
            
                if (r4 != r6) goto L38;
             */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0102 A[LOOP:1: B:32:0x00fc->B:34:0x0102, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                CoroutineScope coroutineScope;
                Object objLoadEntry$default;
                ReferenceManual referenceManual;
                Object objAwaitAll;
                ReferenceManual referenceManual2;
                final List list;
                Iterator it;
                int i;
                int i2;
                Iterator it2;
                Object objAwaitAll2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    StaticContentStore staticContentStore = this.this$0.getStaticContentStore();
                    String contentfulId = this.this$0.getReferenceManualKey().getContentfulId();
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, contentfulId, null, this, 2, null);
                    if (objLoadEntry$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i3 == 1) {
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope2;
                    objLoadEntry$default = obj;
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = this.I$0;
                        list = (List) this.L$1;
                        referenceManual2 = (ReferenceManual) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwaitAll2 = obj;
                        this.$toolbar.setLoadingViewVisible(false);
                        this.this$0.getViewPager().setAdapter(new Adapter((List) objAwaitAll2, this.this$0.getMarkwon()));
                        this.this$0.getTabLayout().setupWithViewPager(this.this$0.getViewPager());
                        this.this$0.getTabLayout().setVisibility(0);
                        this.this$0.getViewPager().setCurrentItem(i2);
                        this.this$0.getViewPager().addOnPageChangeListener(new AnalyticsTabOnPageChangeListener(this.this$0.getAnalytics(), referenceManual2.getIdentifier()) { // from class: com.robinhood.android.common.ui.reference.ReferenceManualActivity.onCreate.1.1.1
                            @Override // com.robinhood.android.common.util.AnalyticsTabOnPageChangeListener
                            protected String getTabName(int position) {
                                return list.get(position).getIdentifier();
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    referenceManual = (ReferenceManual) this.L$1;
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = coroutineScope3;
                    objAwaitAll = obj;
                    referenceManual2 = referenceManual;
                    list = (List) objAwaitAll;
                    ReferenceManualActivity referenceManualActivity = this.this$0;
                    it = list.iterator();
                    i = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (Intrinsics.areEqual(((ReferenceManual.Section) it.next()).getIdentifier(), referenceManualActivity.getReferenceManualKey().getSectionIdentifier())) {
                            i2 = i;
                            break;
                        }
                        i++;
                    }
                    List list2 = list;
                    ReferenceManualActivity referenceManualActivity2 = this.this$0;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReferenceManualActivity3(referenceManualActivity2, (ReferenceManual.Section) it2.next(), null), 3, null));
                    }
                    this.L$0 = referenceManual2;
                    this.L$1 = list;
                    this.I$0 = i2;
                    this.label = 3;
                    objAwaitAll2 = Await2.awaitAll(arrayList, this);
                }
                referenceManual = (ReferenceManual) ((EntryResource) objLoadEntry$default).getValue();
                List<ResourceLink<EntryResource<ReferenceManual.Section>>> sections = referenceManual.getSections();
                ReferenceManualActivity referenceManualActivity3 = this.this$0;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
                Iterator<T> it3 = sections.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ReferenceManualActivity4(referenceManualActivity3, (ResourceLink) it3.next(), null), 3, null));
                }
                this.L$0 = coroutineScope;
                this.L$1 = referenceManual;
                this.label = 2;
                objAwaitAll = Await2.awaitAll(arrayList2, this);
                if (objAwaitAll != coroutine_suspended) {
                    referenceManual2 = referenceManual;
                    list = (List) objAwaitAll;
                    ReferenceManualActivity referenceManualActivity4 = this.this$0;
                    it = list.iterator();
                    i = 0;
                    while (true) {
                        if (it.hasNext()) {
                        }
                        i++;
                    }
                    List list22 = list;
                    ReferenceManualActivity referenceManualActivity22 = this.this$0;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
                    it2 = list22.iterator();
                    while (it2.hasNext()) {
                    }
                    this.L$0 = referenceManual2;
                    this.L$1 = list;
                    this.I$0 = i2;
                    this.label = 3;
                    objAwaitAll2 = Await2.awaitAll(arrayList3, this);
                }
                return coroutine_suspended;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
        toolbar.setElevation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReferenceManualActivity.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity$Adapter;", "Landroidx/viewpager/widget/PagerAdapter;", "sections", "", "Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity$Adapter$Section;", "markwon", "Lio/noties/markwon/Markwon;", "<init>", "(Ljava/util/List;Lio/noties/markwon/Markwon;)V", "getCount", "", "isViewFromObject", "", "view", "Landroid/view/View;", "obj", "", "instantiateItem", "container", "Landroid/view/ViewGroup;", "position", "destroyItem", "", "getPageTitle", "", "Section", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class Adapter extends PagerAdapter {
        private final Markwon markwon;
        private final List<Section> sections;

        public Adapter(List<Section> sections, Markwon markwon) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            this.sections = sections;
            this.markwon = markwon;
        }

        /* compiled from: ReferenceManualActivity.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity$Adapter$Section;", "", "title", "", "content", "Landroid/text/Spanned;", "<init>", "(Ljava/lang/String;Landroid/text/Spanned;)V", "getTitle", "()Ljava/lang/String;", "getContent", "()Landroid/text/Spanned;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Section {
            public static final int $stable = 8;
            private final Spanned content;
            private final String title;

            public static /* synthetic */ Section copy$default(Section section, String str, Spanned spanned, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = section.title;
                }
                if ((i & 2) != 0) {
                    spanned = section.content;
                }
                return section.copy(str, spanned);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final Spanned getContent() {
                return this.content;
            }

            public final Section copy(String title, Spanned content) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(content, "content");
                return new Section(title, content);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Section)) {
                    return false;
                }
                Section section = (Section) other;
                return Intrinsics.areEqual(this.title, section.title) && Intrinsics.areEqual(this.content, section.content);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.content.hashCode();
            }

            public String toString() {
                return "Section(title=" + this.title + ", content=" + ((Object) this.content) + ")";
            }

            public Section(String title, Spanned content) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(content, "content");
                this.title = title;
                this.content = content;
            }

            public final Spanned getContent() {
                return this.content;
            }

            public final String getTitle() {
                return this.title;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.sections.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return Intrinsics.areEqual(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public View instantiateItem(ViewGroup container, int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            View viewInflate$default = ViewGroups.inflate$default(container, C11048R.layout.include_reference_manual_section, false, 2, null);
            TextView textView = (TextView) viewInflate$default.findViewById(C11048R.id.content_txt);
            Intrinsics.checkNotNull(textView);
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(textView, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
            container.addView(viewInflate$default);
            this.markwon.setParsedMarkdown(textView, this.sections.get(position).getContent());
            return viewInflate$default;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup container, int position, Object obj) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(obj, "obj");
            container.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int position) {
            return this.sections.get(position).getTitle();
        }
    }

    /* compiled from: ReferenceManualActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/reference/ReferenceManualActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual;", "<init>", "()V", "EXTRA_REFERENCE_MANUAL", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.ReferenceManual> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.ReferenceManual key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) ReferenceManualActivity.class);
            intent.putExtra(ReferenceManualActivity.EXTRA_REFERENCE_MANUAL, key);
            return intent;
        }
    }
}
