package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureContentState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureCheckboxContentSectionState;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureHeaderState;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoUpgradeDisclosureDataState.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u001b\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\tHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003JU\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureDataState;", "", "getCryptoUserAgreementsResponseDto", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "currentDisclosureIndex", "", "scrolledToBottomAgreementIndices", "", "checkedCheckboxes", "", "Ljava/util/UUID;", "", "isSigningAgreements", "", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;ILjava/util/Set;Ljava/util/Map;Z)V", "getGetCryptoUserAgreementsResponseDto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "getCurrentDisclosureIndex", "()I", "getScrolledToBottomAgreementIndices", "()Ljava/util/Set;", "getCheckedCheckboxes", "()Ljava/util/Map;", "()Z", "cryptoUpgradeDisclosureHeaderState", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureHeaderState;", "getCryptoUpgradeDisclosureHeaderState$feature_crypto_externalDebug", "()Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureHeaderState;", "cryptoUpgradeDisclosureContentState", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState;", "getCryptoUpgradeDisclosureContentState", "()Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState;", "cryptoUpgradeDisclosureBottomBarState", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureBottomBarState;", "getCryptoUpgradeDisclosureBottomBarState", "()Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureBottomBarState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoUpgradeDisclosureDataState {
    public static final int $stable = 8;
    private final Map<UUID, Set<String>> checkedCheckboxes;
    private final int currentDisclosureIndex;
    private final GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto;
    private final boolean isSigningAgreements;
    private final Set<Integer> scrolledToBottomAgreementIndices;

    public CryptoUpgradeDisclosureDataState() {
        this(null, 0, null, null, false, 31, null);
    }

    public static /* synthetic */ CryptoUpgradeDisclosureDataState copy$default(CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState, GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto, int i, Set set, Map map, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            getCryptoUserAgreementsResponseDto = cryptoUpgradeDisclosureDataState.getCryptoUserAgreementsResponseDto;
        }
        if ((i2 & 2) != 0) {
            i = cryptoUpgradeDisclosureDataState.currentDisclosureIndex;
        }
        if ((i2 & 4) != 0) {
            set = cryptoUpgradeDisclosureDataState.scrolledToBottomAgreementIndices;
        }
        if ((i2 & 8) != 0) {
            map = cryptoUpgradeDisclosureDataState.checkedCheckboxes;
        }
        if ((i2 & 16) != 0) {
            z = cryptoUpgradeDisclosureDataState.isSigningAgreements;
        }
        boolean z2 = z;
        Set set2 = set;
        return cryptoUpgradeDisclosureDataState.copy(getCryptoUserAgreementsResponseDto, i, set2, map, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final GetCryptoUserAgreementsResponseDto getGetCryptoUserAgreementsResponseDto() {
        return this.getCryptoUserAgreementsResponseDto;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentDisclosureIndex() {
        return this.currentDisclosureIndex;
    }

    public final Set<Integer> component3() {
        return this.scrolledToBottomAgreementIndices;
    }

    public final Map<UUID, Set<String>> component4() {
        return this.checkedCheckboxes;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSigningAgreements() {
        return this.isSigningAgreements;
    }

    public final CryptoUpgradeDisclosureDataState copy(GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto, int currentDisclosureIndex, Set<Integer> scrolledToBottomAgreementIndices, Map<UUID, ? extends Set<String>> checkedCheckboxes, boolean isSigningAgreements) {
        Intrinsics.checkNotNullParameter(scrolledToBottomAgreementIndices, "scrolledToBottomAgreementIndices");
        Intrinsics.checkNotNullParameter(checkedCheckboxes, "checkedCheckboxes");
        return new CryptoUpgradeDisclosureDataState(getCryptoUserAgreementsResponseDto, currentDisclosureIndex, scrolledToBottomAgreementIndices, checkedCheckboxes, isSigningAgreements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeDisclosureDataState)) {
            return false;
        }
        CryptoUpgradeDisclosureDataState cryptoUpgradeDisclosureDataState = (CryptoUpgradeDisclosureDataState) other;
        return Intrinsics.areEqual(this.getCryptoUserAgreementsResponseDto, cryptoUpgradeDisclosureDataState.getCryptoUserAgreementsResponseDto) && this.currentDisclosureIndex == cryptoUpgradeDisclosureDataState.currentDisclosureIndex && Intrinsics.areEqual(this.scrolledToBottomAgreementIndices, cryptoUpgradeDisclosureDataState.scrolledToBottomAgreementIndices) && Intrinsics.areEqual(this.checkedCheckboxes, cryptoUpgradeDisclosureDataState.checkedCheckboxes) && this.isSigningAgreements == cryptoUpgradeDisclosureDataState.isSigningAgreements;
    }

    public int hashCode() {
        GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto = this.getCryptoUserAgreementsResponseDto;
        return ((((((((getCryptoUserAgreementsResponseDto == null ? 0 : getCryptoUserAgreementsResponseDto.hashCode()) * 31) + Integer.hashCode(this.currentDisclosureIndex)) * 31) + this.scrolledToBottomAgreementIndices.hashCode()) * 31) + this.checkedCheckboxes.hashCode()) * 31) + Boolean.hashCode(this.isSigningAgreements);
    }

    public String toString() {
        return "CryptoUpgradeDisclosureDataState(getCryptoUserAgreementsResponseDto=" + this.getCryptoUserAgreementsResponseDto + ", currentDisclosureIndex=" + this.currentDisclosureIndex + ", scrolledToBottomAgreementIndices=" + this.scrolledToBottomAgreementIndices + ", checkedCheckboxes=" + this.checkedCheckboxes + ", isSigningAgreements=" + this.isSigningAgreements + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoUpgradeDisclosureDataState(GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto, int i, Set<Integer> scrolledToBottomAgreementIndices, Map<UUID, ? extends Set<String>> checkedCheckboxes, boolean z) {
        Intrinsics.checkNotNullParameter(scrolledToBottomAgreementIndices, "scrolledToBottomAgreementIndices");
        Intrinsics.checkNotNullParameter(checkedCheckboxes, "checkedCheckboxes");
        this.getCryptoUserAgreementsResponseDto = getCryptoUserAgreementsResponseDto;
        this.currentDisclosureIndex = i;
        this.scrolledToBottomAgreementIndices = scrolledToBottomAgreementIndices;
        this.checkedCheckboxes = checkedCheckboxes;
        this.isSigningAgreements = z;
    }

    public final GetCryptoUserAgreementsResponseDto getGetCryptoUserAgreementsResponseDto() {
        return this.getCryptoUserAgreementsResponseDto;
    }

    public final int getCurrentDisclosureIndex() {
        return this.currentDisclosureIndex;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CryptoUpgradeDisclosureDataState(bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto r2, int r3, java.util.Set r4, java.util.Map r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L13
            java.util.Set r4 = kotlin.collections.SetsKt.emptySet()
        L13:
            r8 = r7 & 8
            if (r8 == 0) goto L1b
            java.util.Map r5 = kotlin.collections.MapsKt.emptyMap()
        L1b:
            r7 = r7 & 16
            if (r7 == 0) goto L26
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2c
        L26:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2c:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.CryptoUpgradeDisclosureDataState.<init>(bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponseDto, int, java.util.Set, java.util.Map, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Set<Integer> getScrolledToBottomAgreementIndices() {
        return this.scrolledToBottomAgreementIndices;
    }

    public final Map<UUID, Set<String>> getCheckedCheckboxes() {
        return this.checkedCheckboxes;
    }

    public final boolean isSigningAgreements() {
        return this.isSigningAgreements;
    }

    /* renamed from: getCryptoUpgradeDisclosureHeaderState$feature_crypto_externalDebug */
    public final CryptoUpgradeDisclosureHeaderState m1914x792af2e5() {
        List<GetCryptoUserAgreementsResponseDto.CryptoAgreementDto> crypto_agreements;
        List<GetCryptoUserAgreementsResponseDto.CryptoAgreementDto> crypto_agreements2;
        GetCryptoUserAgreementsResponseDto.CryptoAgreementDto cryptoAgreementDto;
        GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto = this.getCryptoUserAgreementsResponseDto;
        String title = (getCryptoUserAgreementsResponseDto == null || (crypto_agreements2 = getCryptoUserAgreementsResponseDto.getCrypto_agreements()) == null || (cryptoAgreementDto = crypto_agreements2.get(this.currentDisclosureIndex)) == null) ? null : cryptoAgreementDto.getTitle();
        int i = this.currentDisclosureIndex;
        GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto2 = this.getCryptoUserAgreementsResponseDto;
        return new CryptoUpgradeDisclosureHeaderState(title, i, (getCryptoUserAgreementsResponseDto2 == null || (crypto_agreements = getCryptoUserAgreementsResponseDto2.getCrypto_agreements()) == null) ? 0 : CollectionsKt.getLastIndex(crypto_agreements));
    }

    public final CryptoUpgradeDisclosureContentState getCryptoUpgradeDisclosureContentState() {
        Object markdown;
        GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto = this.getCryptoUserAgreementsResponseDto;
        if (getCryptoUserAgreementsResponseDto == null) {
            return null;
        }
        GetCryptoUserAgreementsResponseDto.CryptoAgreementDto cryptoAgreementDto = getCryptoUserAgreementsResponseDto.getCrypto_agreements().get(this.currentDisclosureIndex);
        int i = this.currentDisclosureIndex;
        GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto subtitle_content = cryptoAgreementDto.getSubtitle_content();
        List<GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto> signable_agreements = cryptoAgreementDto.getSignable_agreements();
        ArrayList arrayList = new ArrayList();
        for (GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto signableAgreementDto : signable_agreements) {
            List<GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto> agreement_content_sections = signableAgreementDto.getAgreement_content_sections();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreement_content_sections, 10));
            Iterator<T> it = agreement_content_sections.iterator();
            while (it.hasNext()) {
                GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto type2 = ((GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto) it.next()).getType();
                if (type2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (type2 instanceof GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto.Checkbox) {
                    UUID uuid = StringsKt.toUuid(signableAgreementDto.getAgreement_id());
                    GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto.Checkbox checkbox = (GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto.Checkbox) type2;
                    String id = checkbox.getValue().getId();
                    Set<String> set = this.checkedCheckboxes.get(uuid);
                    boolean z = false;
                    if (set != null && set.contains(id)) {
                        z = true;
                    }
                    markdown = new CryptoUpgradeDisclosureContentState.Content.Checkbox(new CryptoUpgradeDisclosureCheckboxContentSectionState(uuid, checkbox.getValue(), z));
                } else {
                    if (!(type2 instanceof GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto.Markdown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    markdown = new CryptoUpgradeDisclosureContentState.Content.Markdown(((GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto.Markdown) type2).getValue());
                }
                arrayList2.add(markdown);
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
        List<GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto> signable_agreements2 = cryptoAgreementDto.getSignable_agreements();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(signable_agreements2, 10));
        Iterator<T> it2 = signable_agreements2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(StringsKt.toUuid(((GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto) it2.next()).getAgreement_id()));
        }
        return new CryptoUpgradeDisclosureContentState(i, subtitle_content, persistentList, extensions2.toPersistentList(arrayList3));
    }

    public final CryptoUpgradeDisclosureBottomBarState getCryptoUpgradeDisclosureBottomBarState() {
        List<GetCryptoUserAgreementsResponseDto.CryptoAgreementDto> crypto_agreements;
        GetCryptoUserAgreementsResponseDto.CryptoAgreementDto cryptoAgreementDto;
        GetCryptoUserAgreementsResponseDto getCryptoUserAgreementsResponseDto = this.getCryptoUserAgreementsResponseDto;
        if (getCryptoUserAgreementsResponseDto == null || (crypto_agreements = getCryptoUserAgreementsResponseDto.getCrypto_agreements()) == null || (cryptoAgreementDto = (GetCryptoUserAgreementsResponseDto.CryptoAgreementDto) CollectionsKt.getOrNull(crypto_agreements, this.currentDisclosureIndex)) == null) {
            return null;
        }
        GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto unscrolled_button = cryptoAgreementDto.getUnscrolled_button();
        boolean zContains = this.scrolledToBottomAgreementIndices.contains(Integer.valueOf(this.currentDisclosureIndex));
        boolean z = true;
        if (unscrolled_button == null || zContains) {
            List<GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto> signable_agreements = cryptoAgreementDto.getSignable_agreements();
            ArrayList<Tuples2> arrayList = new ArrayList();
            for (GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto signableAgreementDto : signable_agreements) {
                List<GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto> agreement_content_sections = signableAgreementDto.getAgreement_content_sections();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = agreement_content_sections.iterator();
                while (it.hasNext()) {
                    GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto type2 = ((GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto) it.next()).getType();
                    Tuples2 tuples2M3642to = type2 instanceof GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto.Checkbox ? Tuples4.m3642to(StringsKt.toUuid(signableAgreementDto.getAgreement_id()), ((GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.TypeDto.Checkbox) type2).getValue().getId()) : null;
                    if (tuples2M3642to != null) {
                        arrayList2.add(tuples2M3642to);
                    }
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            if (!arrayList.isEmpty()) {
                for (Tuples2 tuples2 : arrayList) {
                    UUID uuid = (UUID) tuples2.component1();
                    String str = (String) tuples2.component2();
                    Set<String> set = this.checkedCheckboxes.get(uuid);
                    if (set == null || !set.contains(str)) {
                        z = false;
                        break;
                    }
                }
            }
        }
        boolean z2 = z;
        GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto scrolled_button = cryptoAgreementDto.getScrolled_button();
        if (scrolled_button != null) {
            return new CryptoUpgradeDisclosureBottomBarState(unscrolled_button, scrolled_button, zContains, z2, this.isSigningAgreements);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
