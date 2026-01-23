package com.robinhood.android.slip.onboarding.intro;

import androidx.compose.runtime.SnapshotIntState2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.slip.C28532R;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SlipOnboardingSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$2$1", m3645f = "SlipOnboardingSplashFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipOnboardingSplashFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $headerImageResId$delegate;
    int label;
    final /* synthetic */ SlipOnboardingSplashFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipOnboardingSplashFragment2(SlipOnboardingSplashFragment slipOnboardingSplashFragment, SnapshotIntState2 snapshotIntState2, Continuation<? super SlipOnboardingSplashFragment2> continuation) {
        super(2, continuation);
        this.this$0 = slipOnboardingSplashFragment;
        this.$headerImageResId$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SlipOnboardingSplashFragment2(this.this$0, this.$headerImageResId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SlipOnboardingSplashFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SlipOnboardingSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$2$1$1", m3645f = "SlipOnboardingSplashFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$2$1$1 */
    static final class C286871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotIntState2 $headerImageResId$delegate;
        int label;
        final /* synthetic */ SlipOnboardingSplashFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C286871(SlipOnboardingSplashFragment slipOnboardingSplashFragment, SnapshotIntState2 snapshotIntState2, Continuation<? super C286871> continuation) {
            super(2, continuation);
            this.this$0 = slipOnboardingSplashFragment;
            this.$headerImageResId$delegate = snapshotIntState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C286871(this.this$0, this.$headerImageResId$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SlipOnboardingSplashFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/sheriff/User;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$2$1$1$1", m3645f = "SlipOnboardingSplashFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.slip.onboarding.intro.SlipOnboardingSplashFragment$ComposeContent$1$2$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<User, Continuation<? super Unit>, Object> {
            final /* synthetic */ SnapshotIntState2 $headerImageResId$delegate;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SnapshotIntState2 snapshotIntState2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$headerImageResId$delegate = snapshotIntState2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$headerImageResId$delegate, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(User user, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(user, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (Intrinsics.areEqual(((User) this.L$0).getOrigin().getLocality(), CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    this.$headerImageResId$delegate.setIntValue(C28532R.drawable.slip_splash_header_image_generic_uk);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.getUserStore().getUser()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$headerImageResId$delegate, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SlipOnboardingSplashFragment slipOnboardingSplashFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            C286871 c286871 = new C286871(slipOnboardingSplashFragment, this.$headerImageResId$delegate, null);
            this.label = 1;
            if (RepeatOnLifecycle.repeatOnLifecycle(slipOnboardingSplashFragment, state, c286871, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
