package com.salesforce.android.smi.core.internal.data.repository;

import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConversationEntryRepository.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012.\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00010\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0001`\tH\n"}, m3636d2 = {"<anonymous>", "Lcom/salesforce/android/smi/common/api/Result;", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "result", "files", "Ljava/util/HashMap;", "", "Ljava/io/File;", "Lkotlin/collections/HashMap;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$getConversationEntriesFlow$1$combinedFlow$1", m3645f = "ConversationEntryRepository.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$getConversationEntriesFlow$1$combinedFlow$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ConversationEntryRepository5 extends ContinuationImpl7 implements Function3<Result<? extends List<? extends ConversationEntry>>, HashMap<String, Result<? extends File>>, Continuation<? super Result<? extends List<? extends ConversationEntry>>>, Object> {
    final /* synthetic */ CoroutineScope $scope;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ConversationEntryRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationEntryRepository5(ConversationEntryRepository conversationEntryRepository, CoroutineScope coroutineScope, Continuation<? super ConversationEntryRepository5> continuation) {
        super(3, continuation);
        this.this$0 = conversationEntryRepository;
        this.$scope = coroutineScope;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Result<? extends List<? extends ConversationEntry>> result, HashMap<String, Result<File>> map, Continuation<? super Result<? extends List<? extends ConversationEntry>>> continuation) {
        ConversationEntryRepository5 conversationEntryRepository5 = new ConversationEntryRepository5(this.this$0, this.$scope, continuation);
        conversationEntryRepository5.L$0 = result;
        conversationEntryRepository5.L$1 = map;
        return conversationEntryRepository5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Result<? extends List<? extends ConversationEntry>> result, HashMap<String, Result<? extends File>> map, Continuation<? super Result<? extends List<? extends ConversationEntry>>> continuation) {
        return invoke2(result, (HashMap<String, Result<File>>) map, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Result result = (Result) this.L$0;
        final HashMap map = (HashMap) this.L$1;
        final ConversationEntryRepository conversationEntryRepository = this.this$0;
        final CoroutineScope coroutineScope = this.$scope;
        return com.salesforce.android.smi.common.api.ResultKt.map(result, new Function1() { // from class: com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository$getConversationEntriesFlow$1$combinedFlow$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ConversationEntryRepository5.invokeSuspend$lambda$1(conversationEntryRepository, coroutineScope, map, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Result invokeSuspend$lambda$1(ConversationEntryRepository conversationEntryRepository, CoroutineScope coroutineScope, HashMap map, List list) {
        List list2 = list;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            conversationEntryRepository.loadAttachments(coroutineScope, (ConversationEntry) it.next(), map);
        }
        return new Result.Success(list2);
    }
}
