package sprig.graphics;

import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m3636d2 = {"<anonymous>", "", "run"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
@SourceDebugExtension
/* renamed from: sprig.e.k */
/* loaded from: classes28.dex */
public final class RunnableC49019k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f8378a;

    /* renamed from: b */
    final /* synthetic */ long f8379b;

    /* renamed from: c */
    final /* synthetic */ C49020l f8380c;

    /* renamed from: d */
    final /* synthetic */ EnumC49017i f8381d;

    public RunnableC49019k(CountDownLatch countDownLatch, long j, C49020l c49020l, EnumC49017i enumC49017i) {
        this.f8378a = countDownLatch;
        this.f8379b = j;
        this.f8380c = c49020l;
        this.f8381d = enumC49017i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        this.f8378a.await();
        this.f8380c.m4195a(this.f8381d, System.currentTimeMillis() - this.f8379b);
    }
}
