package com.plaid.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel2;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/plaid/internal/LinkRedirectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class LinkRedirectActivity extends AppCompatActivity {

    /* renamed from: a */
    public final ViewModelLazy f1534a = new ViewModelLazy(Reflection.getOrCreateKotlinClass(C5867I2.class), new C5901b(), new C5900a(), new C5902c());

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.LinkRedirectActivity$a */
    public static final class C5900a extends Lambda implements Function0<ViewModelProvider.Factory> {
        public C5900a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return LinkRedirectActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.LinkRedirectActivity$b */
    public static final class C5901b extends Lambda implements Function0<ViewModelStore> {
        public C5901b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return LinkRedirectActivity.this.getStore();
        }
    }

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.LinkRedirectActivity$c */
    public static final class C5902c extends Lambda implements Function0<CreationExtras> {
        public C5902c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            return LinkRedirectActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5867I2 c5867i2 = (C5867I2) this.f1534a.getValue();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        c5867i2.getClass();
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(this, "activity");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(c5867i2), null, null, new C5858H2(this, C5867I2.m1215a(intent.getData()), null), 3, null);
        finish();
    }
}
