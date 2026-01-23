package com.plaid.internal.link;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowMetrics;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.plaid.internal.AbstractActivityC7151m4;
import com.plaid.internal.AbstractC5991V7;
import com.plaid.internal.AbstractC7134l4;
import com.plaid.internal.AbstractC7207s6;
import com.plaid.internal.AbstractC7256y0;
import com.plaid.internal.C5825D5;
import com.plaid.internal.C5827D7;
import com.plaid.internal.C5830E1;
import com.plaid.internal.C5831E2;
import com.plaid.internal.C5835E6;
import com.plaid.internal.C5876J2;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C5966T0;
import com.plaid.internal.C5972T6;
import com.plaid.internal.C6047b8;
import com.plaid.internal.C7074f2;
import com.plaid.internal.C7094h2;
import com.plaid.internal.C7104i2;
import com.plaid.internal.C7114j2;
import com.plaid.internal.C7160n4;
import com.plaid.internal.C7205s4;
import com.plaid.internal.C7235v7;
import com.plaid.internal.C7240w3;
import com.plaid.internal.C7259y3;
import com.plaid.internal.C7267z2;
import com.plaid.internal.EnumC5880J6;
import com.plaid.internal.InterfaceC6057c8;
import com.plaid.link.C7279R;
import com.plaid.link.Plaid;
import java.io.Serializable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/plaid/internal/link/LinkActivity;", "Lcom/plaid/internal/m4;", "Lcom/plaid/internal/c8;", "<init>", "()V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public class LinkActivity extends AbstractActivityC7151m4 implements InterfaceC6057c8 {

    /* renamed from: e */
    public static final /* synthetic */ int f2928e = 0;

    /* renamed from: c */
    public final ViewModelLazy f2929c = new ViewModelLazy(Reflection.getOrCreateKotlinClass(C7094h2.class), new C7141d(), new C7145h(), new C7142e());

    /* renamed from: d */
    public final ViewModelLazy f2930d = new ViewModelLazy(Reflection.getOrCreateKotlinClass(C7205s4.class), new C7143f(), new C7140c(), new C7144g());

    @DebugMetadata(m3644c = "com.plaid.internal.link.LinkActivity$onBackPressed$1", m3645f = "LinkActivity.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.link.LinkActivity$a */
    public static final class C7138a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f2931a;

        public C7138a(Continuation<? super C7138a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkActivity.this.new C7138a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return LinkActivity.this.new C7138a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f2931a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7094h2 c7094h2 = (C7094h2) LinkActivity.this.f2929c.getValue();
                this.f2931a = 1;
                obj = c7094h2.m1521a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                LinkActivity.super.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.link.LinkActivity$b */
    public /* synthetic */ class C7139b extends FunctionReferenceImpl implements Function1<AbstractC7256y0, Unit> {
        public C7139b(LinkActivity linkActivity) {
            super(1, linkActivity, LinkActivity.class, "navigate", "navigate(Lcom/plaid/internal/workflow/model/Destination;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC7256y0 abstractC7256y0) {
            AbstractC7256y0 p0 = abstractC7256y0;
            Intrinsics.checkNotNullParameter(p0, "p0");
            LinkActivity linkActivity = (LinkActivity) this.receiver;
            int i = LinkActivity.f2928e;
            linkActivity.m1556a(p0);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.link.LinkActivity$c */
    public static final class C7140c extends Lambda implements Function0<ViewModelProvider.Factory> {
        public C7140c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new C7160n4(((C7094h2) LinkActivity.this.f2929c.getValue()).f2826a);
        }
    }

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.link.LinkActivity$d */
    public static final class C7141d extends Lambda implements Function0<ViewModelStore> {
        public C7141d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return LinkActivity.this.getStore();
        }
    }

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.link.LinkActivity$e */
    public static final class C7142e extends Lambda implements Function0<CreationExtras> {
        public C7142e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            return LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.link.LinkActivity$f */
    public static final class C7143f extends Lambda implements Function0<ViewModelStore> {
        public C7143f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return LinkActivity.this.getStore();
        }
    }

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.link.LinkActivity$g */
    public static final class C7144g extends Lambda implements Function0<CreationExtras> {
        public C7144g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            return LinkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: com.plaid.internal.link.LinkActivity$h */
    public static final class C7145h extends Lambda implements Function0<ViewModelProvider.Factory> {
        public C7145h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            LinkActivity linkActivity = LinkActivity.this;
            linkActivity.getClass();
            Plaid plaid = Plaid.INSTANCE;
            Application application = linkActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            return new C7114j2(plaid.provideLinkTokenComponent$link_sdk_release(application));
        }
    }

    /* renamed from: c */
    public static final void m1553c(LinkActivity linkActivity) {
        linkActivity.f2982b = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3365) {
            if (i2 != -1 || intent == null) {
                C5953R5.f1671a.getClass();
                C5953R5.a.m1303a("User denied SMS permission", true);
            } else {
                String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                Intent intent2 = new Intent("link_share_sms_from_consent_result_action");
                intent2.putExtra("link_shared_sms_content_extra", stringExtra);
                sendBroadcast(intent2);
            }
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope((C7094h2) this.f2929c.getValue()), null, null, new C7138a(null), 3, null);
    }

    @Override // com.plaid.internal.AbstractActivityC7151m4, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws C7267z2 {
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("OnCreate", true);
        C5972T6.m1321a(this);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(C7279R.layout.plaid_activity_link);
        C7094h2 c7094h2 = (C7094h2) this.f2929c.getValue();
        C7139b observer = new C7139b(this);
        c7094h2.getClass();
        Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        C5831E2 c5831e2 = c7094h2.f2827b;
        if (c5831e2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigator");
            c5831e2 = null;
        }
        c5831e2.f1338a.observe(this, new C7094h2.a(observer));
        C7094h2 c7094h22 = (C7094h2) this.f2929c.getValue();
        if (c7094h22.f2831f == null) {
            c7094h22.f2831f = BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(c7094h22), Dispatchers.getDefault(), null, new C7104i2(c7094h22, null), 2, null);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("OnPause", true);
        super.onPause();
    }

    @Override // com.plaid.internal.AbstractActivityC7151m4, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("OnResume", true);
        super.onResume();
    }

    /* renamed from: a */
    public static final C7205s4 m1550a(LinkActivity linkActivity) {
        return (C7205s4) linkActivity.f2930d.getValue();
    }

    @Override // com.plaid.internal.InterfaceC6057c8
    /* renamed from: b */
    public final C7259y3 mo1382b() {
        return new C7259y3(((C7094h2) this.f2929c.getValue()).f2826a);
    }

    /* renamed from: c */
    public final void m1558c() {
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((String) null))));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    @Override // com.plaid.internal.AbstractActivityC7151m4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1554a(Intent intent) {
        AbstractC7207s6 dVar;
        Exception runtimeException;
        C5953R5.f1671a.getClass();
        C5953R5.a.m1303a("onIntentReady", true);
        C7094h2 c7094h2 = (C7094h2) this.f2929c.getValue();
        if (intent == null) {
            dVar = null;
        } else if (intent.getBooleanExtra("redirect_error", false)) {
            Serializable serializableExtra = intent.getSerializableExtra("redirect_error_exception");
            if (serializableExtra != null) {
                runtimeException = (Exception) serializableExtra;
            } else {
                runtimeException = new RuntimeException("Unknown oauth redirect exception");
            }
            dVar = new AbstractC7207s6.d(runtimeException);
        } else if (intent.hasExtra("link_oauth_redirect") || intent.hasExtra("link_out_of_process_complete_redirect") || intent.hasExtra("link_out_of_process_closed_redirect_uri") || intent.hasExtra("link_resume_redirect")) {
            if (intent.hasExtra("link_out_of_process_closed_redirect_uri")) {
                dVar = new AbstractC7207s6.c();
            } else if (intent.hasExtra("link_resume_redirect")) {
                dVar = new AbstractC7207s6.e();
            } else {
                String stringExtra = intent.getStringExtra("link_oauth_received_redirect_uri");
                if (stringExtra != null) {
                    dVar = new AbstractC7207s6.a(stringExtra);
                } else {
                    String stringExtra2 = intent.getStringExtra("link_out_of_process_complete_redirect_uri");
                    if (stringExtra2 != null) {
                        dVar = new AbstractC7207s6.b(stringExtra2);
                    } else {
                        dVar = new AbstractC7207s6.d(new RuntimeException("Redirect uri cannot be null"));
                    }
                }
            }
        }
        c7094h2.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(c7094h2), null, null, new C7074f2(dVar, c7094h2, null), 3, null);
    }

    /* renamed from: a */
    public final void m1556a(AbstractC7256y0 abstractC7256y0) {
        C5953R5.a.m1299a(C5953R5.f1671a, "Navigating to " + abstractC7256y0);
        try {
            if (Intrinsics.areEqual(abstractC7256y0, AbstractC7256y0.e.f3311a)) {
                C7240w3 fragment = new C7240w3();
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                fragmentTransactionBeginTransaction.replace(C7279R.id.fragment_container, fragment);
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.i) {
                Fragment fragment2 = (Fragment) ((AbstractC7256y0.i.a.C49495a) ((AbstractC7256y0.i) abstractC7256y0).m1661a()).invoke(((AbstractC7256y0.i) abstractC7256y0).mo1662b());
                Intrinsics.checkNotNullParameter(fragment2, "fragment");
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionBeginTransaction2 = supportFragmentManager2.beginTransaction();
                fragmentTransactionBeginTransaction2.replace(C7279R.id.fragment_container, fragment2);
                fragmentTransactionBeginTransaction2.commitAllowingStateLoss();
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.j) {
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 96171, ((AbstractC7256y0.j) abstractC7256y0).m1663a());
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.d) {
                Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, ((AbstractC7256y0.d) abstractC7256y0).m1658a());
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.f) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((AbstractC7256y0.f) abstractC7256y0).m1659a())));
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.g) {
                m1555a(((AbstractC7256y0.g) abstractC7256y0).m1660a());
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.a) {
                ((AbstractC7256y0.a) abstractC7256y0).getClass();
                m1558c();
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.k) {
                EnumC5880J6 smsAutofillType = ((AbstractC7256y0.k) abstractC7256y0).m1664a();
                int i = C7235v7.f3248l;
                Intrinsics.checkNotNullParameter(smsAutofillType, "smsAutofillType");
                C7235v7 fragment3 = new C7235v7();
                Bundle bundle = new Bundle();
                bundle.putSerializable("smsAutofillType", smsAutofillType);
                fragment3.setArguments(bundle);
                Intrinsics.checkNotNullParameter(fragment3, "fragment");
                FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionBeginTransaction3 = supportFragmentManager3.beginTransaction();
                fragmentTransactionBeginTransaction3.replace(C7279R.id.fragment_container, fragment3);
                fragmentTransactionBeginTransaction3.commitAllowingStateLoss();
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.h) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(this), null, null, new C5830E1(this, null), 3, null);
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.b) {
                ((C7205s4) this.f2930d.getValue()).m1609a(((AbstractC7256y0.b) abstractC7256y0).m1656a());
                return;
            }
            if (abstractC7256y0 instanceof AbstractC7256y0.c) {
                int i2 = C5966T0.f1701c;
                C5966T0 fragment4 = C5966T0.a.m1316a(((AbstractC7256y0.c) abstractC7256y0).m1657a());
                Intrinsics.checkNotNullParameter(fragment4, "fragment");
                FragmentManager supportFragmentManager4 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionBeginTransaction4 = supportFragmentManager4.beginTransaction();
                fragmentTransactionBeginTransaction4.replace(C7279R.id.fragment_container, fragment4);
                fragmentTransactionBeginTransaction4.commitAllowingStateLoss();
            }
        } catch (Exception e) {
            C5953R5.a.m1306b(C5953R5.f1671a, e, "Error occurred while trying to render: " + abstractC7256y0);
            Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(this, 6148, C5876J2.m1228b(e, null));
        }
    }

    /* renamed from: a */
    public final void m1555a(AbstractC7134l4 abstractC7134l4) {
        int iCoerceAtMost;
        if (abstractC7134l4 instanceof AbstractC7134l4.d) {
            String str = abstractC7134l4.f2919a;
            int i = ((AbstractC7134l4.d) abstractC7134l4).f2920b;
            PackageManager packageManager = getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            Intrinsics.checkNotNullParameter(packageManager, "packageManager");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "queryIntentServices(...)");
            if (listQueryIntentServices.isEmpty()) {
                Intrinsics.checkNotNullParameter("Can't open custom tab -- custom tabs are not supported on this device", "message");
                C5953R5.a.m1304b(C5953R5.f1671a, "Can't open custom tab -- custom tabs are not supported on this device");
                C5825D5 c5825d5 = C5835E6.f1339a;
                if (c5825d5 != null) {
                    c5825d5.m1175a("Can't open custom tab -- custom tabs are not supported on this device");
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                iCoerceAtMost = maximumWindowMetrics.getBounds().height();
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                iCoerceAtMost = displayMetrics.heightPixels;
            }
            if (i != 0) {
                iCoerceAtMost = RangesKt.coerceAtMost(iCoerceAtMost, i);
            }
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().setInitialActivityHeightPx(iCoerceAtMost, 2).build();
            Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
            Intent intent = customTabsIntentBuild.intent;
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            intent.addFlags(1073741824);
            intent.setData(Uri.parse(str));
            startActivityForResult(intent, 0);
            return;
        }
        if (abstractC7134l4 instanceof AbstractC7134l4.c) {
            m1557a(abstractC7134l4.f2919a);
        } else if (abstractC7134l4 instanceof AbstractC7134l4.b) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(abstractC7134l4.f2919a)));
        }
    }

    /* renamed from: a */
    public final void m1557a(String str) {
        PackageManager packageManager = getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "queryIntentServices(...)");
        if (listQueryIntentServices.isEmpty()) {
            Intrinsics.checkNotNullParameter("Can't open custom tab -- custom tabs are not supported on this device", "message");
            C5953R5.a.m1304b(C5953R5.f1671a, "Can't open custom tab -- custom tabs are not supported on this device");
            C5825D5 c5825d5 = C5835E6.f1339a;
            if (c5825d5 != null) {
                c5825d5.m1175a("Can't open custom tab -- custom tabs are not supported on this device");
                return;
            }
            return;
        }
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
        customTabsIntentBuild.launchUrl(this, Uri.parse(str));
    }

    @Override // com.plaid.internal.InterfaceC6057c8
    /* renamed from: a */
    public final C6047b8 mo1381a(AbstractC5991V7.a createWorkflowViewModel) {
        Intrinsics.checkNotNullParameter(createWorkflowViewModel, "createWorkflowViewModel");
        return new C6047b8(createWorkflowViewModel, ((C7094h2) this.f2929c.getValue()).f2826a);
    }

    @Override // com.plaid.internal.InterfaceC6057c8
    /* renamed from: a */
    public final C5827D7 mo1380a() {
        return new C5827D7(((C7094h2) this.f2929c.getValue()).f2826a);
    }
}
