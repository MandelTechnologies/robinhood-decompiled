package com.plaid.internal;

import androidx.core.os.Bundle2;
import com.plaid.internal.AbstractC5894L2;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import kotlin.Tuples4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* renamed from: com.plaid.internal.y0 */
/* loaded from: classes16.dex */
public abstract class AbstractC7256y0 {

    /* renamed from: com.plaid.internal.y0$a */
    public static final class a extends AbstractC7256y0 {
    }

    /* renamed from: com.plaid.internal.y0$b */
    public static final class b extends AbstractC7256y0 {

        /* renamed from: a */
        public final boolean f3308a;

        public b(boolean z) {
            this.f3308a = z;
        }

        /* renamed from: a */
        public final boolean m1656a() {
            return this.f3308a;
        }
    }

    /* renamed from: com.plaid.internal.y0$c */
    public static final class c extends AbstractC7256y0 {

        /* renamed from: a */
        public final AbstractC5894L2.i f3309a;

        public c(AbstractC5894L2.i error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f3309a = error;
        }

        /* renamed from: a */
        public final AbstractC5894L2.i m1657a() {
            return this.f3309a;
        }
    }

    /* renamed from: com.plaid.internal.y0$d */
    public static final class d extends AbstractC7256y0 {

        /* renamed from: a */
        public final LinkExit f3310a;

        public d(LinkExit exit) {
            Intrinsics.checkNotNullParameter(exit, "exit");
            this.f3310a = exit;
        }

        /* renamed from: a */
        public final LinkExit m1658a() {
            return this.f3310a;
        }
    }

    /* renamed from: com.plaid.internal.y0$e */
    public static final class e extends AbstractC7256y0 {

        /* renamed from: a */
        public static final e f3311a = new e();
    }

    /* renamed from: com.plaid.internal.y0$f */
    public static final class f extends AbstractC7256y0 {

        /* renamed from: a */
        public final String f3312a;

        public f(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f3312a = url;
        }

        /* renamed from: a */
        public final String m1659a() {
            return this.f3312a;
        }
    }

    /* renamed from: com.plaid.internal.y0$g */
    public static final class g extends AbstractC7256y0 {

        /* renamed from: a */
        public final AbstractC7134l4 f3313a;

        public g(AbstractC7134l4 openMethod) {
            Intrinsics.checkNotNullParameter(openMethod, "openMethod");
            this.f3313a = openMethod;
        }

        /* renamed from: a */
        public final AbstractC7134l4 m1660a() {
            return this.f3313a;
        }
    }

    /* renamed from: com.plaid.internal.y0$h */
    public static final class h extends AbstractC7256y0 {
        public h(String url, String webviewFallbackId, C5792A channelInfo) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
            Intrinsics.checkNotNullParameter(channelInfo, "channelInfo");
        }
    }

    /* renamed from: com.plaid.internal.y0$i */
    public static abstract class i<F extends AbstractC5991V7<?>> extends AbstractC7256y0 {

        /* renamed from: a */
        public final a.C49495a f3314a;

        /* renamed from: com.plaid.internal.y0$i$a */
        public static final class a extends i<C7113j1> {

            /* renamed from: b */
            public final C6009X7 f3315b;

            @SourceDebugExtension
            /* renamed from: com.plaid.internal.y0$i$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C49495a extends FunctionReferenceImpl implements Function1<C6009X7, C7113j1> {
                public C49495a(C6000W7 c6000w7) {
                    super(1, c6000w7, C6000W7.class, "createWorkflowPaneFragment", "createWorkflowPaneFragment(Lcom/plaid/internal/workflow/model/WorkflowPaneId;)Lcom/plaid/internal/workflow/panes/WorkflowPaneFragment;", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public final C7113j1 invoke(C6009X7 c6009x7) {
                    C6009X7 paneId = c6009x7;
                    Intrinsics.checkNotNullParameter(paneId, "p0");
                    int i = AbstractC5991V7.f1781d;
                    AbstractC5991V7 abstractC5991V7 = (AbstractC5991V7) C7113j1.class.newInstance();
                    abstractC5991V7.getClass();
                    Intrinsics.checkNotNullParameter(paneId, "paneId");
                    Intrinsics.checkNotNullParameter(paneId, "paneId");
                    abstractC5991V7.setArguments(Bundle2.bundleOf(Tuples4.m3642to("workflow_pane_id", paneId)));
                    return (C7113j1) abstractC5991V7;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6009X7 pane) {
                super(new C49495a(C6000W7.f1811a));
                Intrinsics.checkNotNullParameter(pane, "pane");
                this.f3315b = pane;
            }

            @Override // com.plaid.internal.AbstractC7256y0.i
            /* renamed from: b */
            public final C6009X7 mo1662b() {
                return this.f3315b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f3315b, ((a) obj).f3315b);
            }

            public final int hashCode() {
                return this.f3315b.hashCode();
            }

            public final String toString() {
                return "HeadlessOAuth(pane=" + this.f3315b + ")";
            }
        }

        public i() {
            throw null;
        }

        public i(a.C49495a c49495a) {
            this.f3314a = c49495a;
        }

        /* renamed from: a */
        public final Function1<C6009X7, F> m1661a() {
            return this.f3314a;
        }

        /* renamed from: b */
        public abstract C6009X7 mo1662b();
    }

    /* renamed from: com.plaid.internal.y0$j */
    public static final class j extends AbstractC7256y0 {

        /* renamed from: a */
        public final LinkSuccess f3316a;

        public j(LinkSuccess success) {
            Intrinsics.checkNotNullParameter(success, "success");
            this.f3316a = success;
        }

        /* renamed from: a */
        public final LinkSuccess m1663a() {
            return this.f3316a;
        }
    }

    /* renamed from: com.plaid.internal.y0$k */
    public static final class k extends AbstractC7256y0 {

        /* renamed from: a */
        public final EnumC5880J6 f3317a;

        public k(String url, String webviewFallbackId, EnumC5880J6 smsAutofillType) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
            Intrinsics.checkNotNullParameter(smsAutofillType, "smsAutofillType");
            this.f3317a = smsAutofillType;
        }

        /* renamed from: a */
        public final EnumC5880J6 m1664a() {
            return this.f3317a;
        }
    }

    public AbstractC7256y0() {
        Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "getSimpleName(...)");
    }
}
