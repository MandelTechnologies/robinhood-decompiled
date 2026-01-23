package coil.request;

import android.view.View;
import coil.content.Utils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: ViewTargetRequestManager.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lcoil/request/ViewTargetDisposable;", "disposable", "", "isDisposed", "(Lcoil/request/ViewTargetDisposable;)Z", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "job", "getDisposable", "(Lkotlinx/coroutines/Deferred;)Lcoil/request/ViewTargetDisposable;", "", "dispose", "()V", "Lcoil/request/ViewTargetRequestDelegate;", "request", "setRequest", "(Lcoil/request/ViewTargetRequestDelegate;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "currentDisposable", "Lcoil/request/ViewTargetDisposable;", "Lkotlinx/coroutines/Job;", "pendingClear", "Lkotlinx/coroutines/Job;", "currentRequest", "Lcoil/request/ViewTargetRequestDelegate;", "isRestart", "Z", "coil-base_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {
    private Disposable3 currentDisposable;
    private RequestDelegate3 currentRequest;
    private boolean isRestart;
    private Job pendingClear;
    private final View view;

    public ViewTargetRequestManager(View view) {
        this.view = view;
    }

    public final synchronized boolean isDisposed(Disposable3 disposable) {
        return disposable != this.currentDisposable;
    }

    public final synchronized Disposable3 getDisposable(Deferred<? extends ImageResult> job) {
        Disposable3 disposable3 = this.currentDisposable;
        if (disposable3 != null && Utils.isMainThread() && this.isRestart) {
            this.isRestart = false;
            disposable3.setJob(job);
            return disposable3;
        }
        Job job2 = this.pendingClear;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, null, 1, null);
        }
        this.pendingClear = null;
        Disposable3 disposable32 = new Disposable3(this.view, job);
        this.currentDisposable = disposable32;
        return disposable32;
    }

    /* compiled from: ViewTargetRequestManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "coil.request.ViewTargetRequestManager$dispose$1", m3645f = "ViewTargetRequestManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: coil.request.ViewTargetRequestManager$dispose$1 */
    static final class C46361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C46361(Continuation<? super C46361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ViewTargetRequestManager.this.new C46361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C46361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ViewTargetRequestManager.this.setRequest(null);
            return Unit.INSTANCE;
        }
    }

    public final synchronized void dispose() {
        try {
            Job job = this.pendingClear;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.pendingClear = BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, Dispatchers.getMain().getImmediate(), null, new C46361(null), 2, null);
            this.currentDisposable = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setRequest(RequestDelegate3 request) {
        RequestDelegate3 requestDelegate3 = this.currentRequest;
        if (requestDelegate3 != null) {
            requestDelegate3.dispose();
        }
        this.currentRequest = request;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        RequestDelegate3 requestDelegate3 = this.currentRequest;
        if (requestDelegate3 == null) {
            return;
        }
        this.isRestart = true;
        requestDelegate3.restart();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        RequestDelegate3 requestDelegate3 = this.currentRequest;
        if (requestDelegate3 != null) {
            requestDelegate3.dispose();
        }
    }
}
