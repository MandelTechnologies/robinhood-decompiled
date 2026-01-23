package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiDirectDepositRelationship;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: DirectDepositRelationshipStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiDirectDepositRelationship;", "entityType", "Lcom/robinhood/models/entity/RhEntity;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$endpoint$1", m3645f = "DirectDepositRelationshipStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 64}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class DirectDepositRelationshipStore2 extends ContinuationImpl7 implements Function2<RhEntity, Continuation<? super PaginatedResult<? extends ApiDirectDepositRelationship>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DirectDepositRelationshipStore this$0;

    /* compiled from: DirectDepositRelationshipStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore$endpoint$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RhEntity.values().length];
            try {
                iArr[RhEntity.RHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RhEntity.RHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RhEntity.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositRelationshipStore2(DirectDepositRelationshipStore directDepositRelationshipStore, Continuation<? super DirectDepositRelationshipStore2> continuation) {
        super(2, continuation);
        this.this$0 = directDepositRelationshipStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DirectDepositRelationshipStore2 directDepositRelationshipStore2 = new DirectDepositRelationshipStore2(this.this$0, continuation);
        directDepositRelationshipStore2.L$0 = obj;
        return directDepositRelationshipStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(RhEntity rhEntity, Continuation<? super PaginatedResult<ApiDirectDepositRelationship>> continuation) {
        return ((DirectDepositRelationshipStore2) create(rhEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(RhEntity rhEntity, Continuation<? super PaginatedResult<? extends ApiDirectDepositRelationship>> continuation) {
        return invoke2(rhEntity, (Continuation<? super PaginatedResult<ApiDirectDepositRelationship>>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r7 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RhEntity rhEntity;
        String accountNumberRhs;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            rhEntity = (RhEntity) this.L$0;
            int i2 = WhenMappings.$EnumSwitchMapping$0[rhEntity.ordinal()];
            if (i2 == 1) {
                this.this$0.accountProvider.refresh(false);
                Observable<Account> observableStreamIndividualAccount = this.this$0.accountProvider.streamIndividualAccount();
                this.L$0 = rhEntity;
                this.label = 1;
                obj = RxAwait3.awaitFirst(observableStreamIndividualAccount, this);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unknown RhEntity!");
                }
                this.this$0.rhyAccountStore.refresh(false);
                Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(this.this$0.rhyAccountStore.streamSpendingAccount());
                this.L$0 = rhEntity;
                this.label = 2;
                obj = RxAwait3.awaitFirst(observableFilterIsPresent, this);
            }
        }
        if (i == 1) {
            rhEntity = (RhEntity) this.L$0;
            ResultKt.throwOnFailure(obj);
            accountNumberRhs = ((Account) obj).getAccountNumberRhs();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            rhEntity = (RhEntity) this.L$0;
            ResultKt.throwOnFailure(obj);
            accountNumberRhs = ((RhyAccount) obj).getId().toString();
            Intrinsics.checkNotNull(accountNumberRhs);
        }
        RhyBonfireApi rhyBonfireApi = this.this$0.bonfireApi;
        this.L$0 = null;
        this.label = 3;
        Object directDepositRelationships = rhyBonfireApi.getDirectDepositRelationships(accountNumberRhs, rhEntity, this);
        return directDepositRelationships == coroutine_suspended ? coroutine_suspended : directDepositRelationships;
    }
}
