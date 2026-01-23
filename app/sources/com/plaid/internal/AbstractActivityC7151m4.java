package com.plaid.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* renamed from: com.plaid.internal.m4 */
/* loaded from: classes16.dex */
public abstract class AbstractActivityC7151m4 extends AppCompatActivity {

    /* renamed from: a */
    public a f2981a = a.C49494a.f2983a;

    /* renamed from: b */
    public boolean f2982b;

    /* renamed from: com.plaid.internal.m4$a */
    public static abstract class a {

        /* renamed from: com.plaid.internal.m4$a$a, reason: collision with other inner class name */
        public static final class C49494a extends a {

            /* renamed from: a */
            public static final C49494a f2983a = new C49494a();
        }

        /* renamed from: com.plaid.internal.m4$a$b */
        public static final class b extends a {

            /* renamed from: a */
            public final Intent f2984a;

            public b(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.f2984a = intent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.f2984a, ((b) obj).f2984a);
            }

            public final int hashCode() {
                return this.f2984a.hashCode();
            }

            public final String toString() {
                return "OnCreate(intent=" + this.f2984a + ")";
            }
        }

        /* renamed from: com.plaid.internal.m4$a$c */
        public static final class c extends a {

            /* renamed from: a */
            public final Intent f2985a;

            public c(Intent intent) {
                this.f2985a = intent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f2985a, ((c) obj).f2985a);
            }

            public final int hashCode() {
                Intent intent = this.f2985a;
                if (intent == null) {
                    return 0;
                }
                return intent.hashCode();
            }

            public final String toString() {
                return "OnNewIntent(intent=" + this.f2985a + ")";
            }
        }
    }

    /* renamed from: a */
    public abstract void mo1554a(Intent intent);

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2982b = bundle.getBoolean("outOfProcessActivityLaunched", false);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        this.f2981a = new a.b(intent);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f2981a = new a.c(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a cVar = this.f2981a;
        if (this.f2982b) {
            this.f2982b = false;
            if (Intrinsics.areEqual(cVar, a.C49494a.f2983a)) {
                Intent intent = new Intent();
                intent.putExtra("link_out_of_process_closed_redirect_uri", true);
                cVar = new a.c(intent);
            } else if (cVar instanceof a.b) {
                ((a.b) cVar).f2984a.putExtra("link_out_of_process_closed_redirect_uri", true);
            }
        }
        this.f2981a = a.C49494a.f2983a;
        if (cVar instanceof a.C49494a) {
            return;
        }
        if (cVar instanceof a.b) {
            mo1554a(((a.b) cVar).f2984a);
        } else if (cVar instanceof a.c) {
            mo1554a(((a.c) cVar).f2985a);
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("outOfProcessActivityLaunched", this.f2982b);
    }
}
