package com.robinhood.android.pathfinder.corepages.contactchannel;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.pathfinder.corepages.contactchannel.ContactChannelViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.models.api.BannerIcon2;
import com.robinhood.models.p355ui.Banner;
import com.robinhood.models.p355ui.pathfinder.contexts.ContactChannelContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ContactChannelStateProvider.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002R\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelDataState;", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState;", "<init>", "()V", "reduce", "dataState", "toContactChannelBanner", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ContactChannelBanner;", "Lcom/robinhood/models/ui/Banner;", "toChannelItem", "Lcom/robinhood/android/pathfinder/corepages/contactchannel/ContactChannelViewState$ChannelItem;", "Lcom/robinhood/models/ui/pathfinder/contexts/ContactChannelContext$ContactChannelOption;", "prependAvailabilityToSubtitle", "Lcom/robinhood/models/serverdriven/db/RichText;", "availability", "subtitle", "", "iconResId", "", "getIconResId", "(Lcom/robinhood/models/ui/pathfinder/contexts/ContactChannelContext$ContactChannelOption;)I", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ContactChannelStateProvider implements StateProvider<ContactChannelDataState, ContactChannelViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public ContactChannelViewState reduce(ContactChannelDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ContactChannelContext context = dataState.getContext();
        boolean zIsSendingUserInput = dataState.isSendingUserInput();
        String title = context.getTitle();
        Banner banner = context.getBanner();
        ContactChannelViewState.ContactChannelBanner contactChannelBanner = banner != null ? toContactChannelBanner(banner) : null;
        List<ContactChannelContext.ContactChannelOption> options = context.getOptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(toChannelItem((ContactChannelContext.ContactChannelOption) it.next()));
        }
        return new ContactChannelViewState(zIsSendingUserInput, title, contactChannelBanner, extensions2.toImmutableList(arrayList), context.getDisclaimer());
    }

    private final ContactChannelViewState.ContactChannelBanner toContactChannelBanner(Banner banner) {
        return new ContactChannelViewState.ContactChannelBanner(BannerIcon2.getDrawable(banner.getIcon()), banner.getTitle());
    }

    private final ContactChannelViewState.ChannelItem toChannelItem(ContactChannelContext.ContactChannelOption contactChannelOption) {
        String id = contactChannelOption.getId();
        RichText richText = new RichText(contactChannelOption.getTitle(), CollectionsKt.emptyList());
        com.robinhood.models.serverdriven.experimental.api.RichText availabilitySubtitle = contactChannelOption.getAvailabilitySubtitle();
        return new ContactChannelViewState.ChannelItem(id, richText, prependAvailabilityToSubtitle(availabilitySubtitle != null ? IconExtensions.toDbRichText(availabilitySubtitle) : null, contactChannelOption.getSubtitle()), getIconResId(contactChannelOption), !Intrinsics.areEqual(contactChannelOption.getDisabled(), Boolean.TRUE));
    }

    private final RichText prependAvailabilityToSubtitle(RichText availability, String subtitle) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if (availability != null) {
            sb.append(availability.getText());
            sb.append("\n");
            arrayList.addAll(availability.getAttributes());
        }
        if (subtitle != null) {
            sb.append(subtitle);
        }
        if (StringsKt.isBlank(sb)) {
            return null;
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new RichText(string2, arrayList);
    }

    private final int getIconResId(ContactChannelContext.ContactChannelOption contactChannelOption) {
        String id = contactChannelOption.getId();
        int iHashCode = id.hashCode();
        if (iHashCode != -724568994) {
            if (iHashCode != 96619420) {
                if (iHashCode == 297155363 && id.equals(ContactChannelViewState.CHANNEL_ID_OUTBOUND_VOICE)) {
                    return C20690R.drawable.ic_rds_phone_24dp;
                }
            } else if (id.equals("email")) {
                return C20690R.drawable.ic_rds_email_filled_24dp;
            }
        } else if (id.equals(ContactChannelViewState.CHANNEL_ID_INBOUND_CHAT)) {
            return C20690R.drawable.ic_rds_chat_24dp;
        }
        return C20690R.drawable.ic_rds_robinhood_24dp;
    }
}
