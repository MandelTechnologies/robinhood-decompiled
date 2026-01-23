package com.robinhood.android.equities.equityproxyvoting;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.models.p320db.ProxyCommunication;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* compiled from: EquityProxyVotingRow.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equities/equityproxyvoting/ProxyVotePreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/equities/equityproxyvoting/PreviewStates;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-equity-proxy-voting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.equityproxyvoting.ProxyVotePreviewParameterProvider, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityProxyVotingRow8 implements PreviewParameterProvider<PreviewStates> {
    private final Sequence<PreviewStates> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public EquityProxyVotingRow8() {
        StringResource.Companion companion = StringResource.INSTANCE;
        List<StringResource> listListOf = CollectionsKt.listOf((Object[]) new StringResource[]{companion.invoke("2025 Annual Meeting"), companion.invoke("Special Meeting")});
        ArrayList arrayList = new ArrayList();
        for (StringResource stringResource : listListOf) {
            EnumEntries<ProxyCommunication.VoteStatus> entries = ProxyCommunication.VoteStatus.getEntries();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
            Iterator<ProxyCommunication.VoteStatus> it = entries.iterator();
            while (it.hasNext()) {
                arrayList2.add(new PreviewStates(stringResource, it.next()));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        this.values = CollectionsKt.asSequence(arrayList);
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<PreviewStates> getValues() {
        return this.values;
    }
}
