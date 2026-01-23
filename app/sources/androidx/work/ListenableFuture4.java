package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ListenableFuture.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m3636d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
@SourceDebugExtension
/* renamed from: androidx.work.ListenableFutureKt$await$2$2, reason: use source file name */
/* loaded from: classes16.dex */
public final class ListenableFuture4 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ListenableFuture<Object> $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFuture4(ListenableFuture<Object> listenableFuture) {
        super(1);
        this.$this_await = listenableFuture;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_await.cancel(false);
    }
}
