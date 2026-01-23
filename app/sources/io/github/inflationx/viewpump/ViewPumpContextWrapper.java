package io.github.inflationx.viewpump;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import io.github.inflationx.viewpump.internal.ViewPumpLayoutInflater;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewPumpContextWrapper.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lio/github/inflationx/viewpump/ViewPumpContextWrapper;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "viewPump", "Lio/github/inflationx/viewpump/ViewPump;", "(Landroid/content/Context;Lio/github/inflationx/viewpump/ViewPump;)V", "inflater", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;", "getInflater", "()Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;", "inflater$delegate", "Lkotlin/Lazy;", "getSystemService", "", "name", "", "Companion", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ViewPumpContextWrapper extends ContextWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: inflater$delegate, reason: from kotlin metadata */
    private final Lazy inflater;
    private final ViewPump viewPump;

    public /* synthetic */ ViewPumpContextWrapper(Context context, ViewPump viewPump, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewPump);
    }

    private ViewPumpContextWrapper(Context context, ViewPump viewPump) {
        super(context);
        this.viewPump = viewPump;
        this.inflater = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewPumpLayoutInflater>() { // from class: io.github.inflationx.viewpump.ViewPumpContextWrapper$inflater$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewPumpLayoutInflater invoke() {
                ViewPump viewPump2 = this.this$0.viewPump;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.this$0.getBaseContext());
                Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(baseContext)");
                return new ViewPumpLayoutInflater(viewPump2, layoutInflaterFrom, this.this$0, false);
            }
        });
    }

    private final ViewPumpLayoutInflater getInflater() {
        return (ViewPumpLayoutInflater) this.inflater.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.areEqual("layout_inflater", name)) {
            return getInflater();
        }
        return super.getSystemService(name);
    }

    /* compiled from: ViewPumpContextWrapper.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lio/github/inflationx/viewpump/ViewPumpContextWrapper$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "base", "Lio/github/inflationx/viewpump/ViewPump;", "viewPump", "Landroid/content/ContextWrapper;", "wrap", "(Landroid/content/Context;Lio/github/inflationx/viewpump/ViewPump;)Landroid/content/ContextWrapper;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ContextWrapper wrap(Context base, ViewPump viewPump) {
            Intrinsics.checkNotNullParameter(base, "base");
            Intrinsics.checkNotNullParameter(viewPump, "viewPump");
            return new ViewPumpContextWrapper(base, viewPump, null);
        }
    }
}
