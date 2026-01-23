package com.robinhood.android.pathfinder.corepages.contactchannel;

import androidx.compose.p011ui.tooling.preview.datasource.CollectionPreviewParameterProvider;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelViewState;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ContactChannelComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewStatePreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelViewStatePreviewParameterProvider, reason: use source file name */
/* loaded from: classes11.dex */
final class ContactChannelComposable4 extends CollectionPreviewParameterProvider<ContactChannelViewState> {
    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public ContactChannelComposable4() {
        List listListOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.FALSE, Boolean.TRUE});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new ContactChannelViewState(((Boolean) it.next()).booleanValue(), "The gang's all here", new ContactChannelViewState.ContactChannelBanner(C20690R.drawable.ic_rds_qr_16dp, new RichText("This is a big deal", CollectionsKt.emptyList())), extensions2.persistentListOf(new ContactChannelViewState.ChannelItem("0", new RichText("Some text", CollectionsKt.emptyList()), new RichText("Even more text", CollectionsKt.emptyList()), C20690R.drawable.ic_rds_wallet_32dp, true), new ContactChannelViewState.ChannelItem(Constants.SdidMigrationStatusCodes.ALREADY_SDID, new RichText("Bananas", CollectionsKt.emptyList()), new RichText("B-A-N-A-N-A-S", CollectionsKt.emptyList()), C20690R.drawable.ic_rds_actions_alerts_32dp, true), new ContactChannelViewState.ChannelItem(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, new RichText("Apples", CollectionsKt.emptyList()), new RichText("Tim Apple", CollectionsKt.emptyList()), C20690R.drawable.ic_rds_tab_search_32dp, true)), new com.robinhood.models.serverdriven.experimental.api.RichText("Other things you should know", CollectionsKt.emptyList())));
        }
        super(arrayList);
    }
}
