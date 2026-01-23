package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.document.DocumentPages;
import com.withpersona.sdk2.inquiry.document.DocumentPages2;
import com.withpersona.sdk2.inquiry.document.DocumentPages3;
import com.withpersona.sdk2.inquiry.governmentid.Conversions3;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.OverridableText;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition2;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.selfie.DesignVersion;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Conversions.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u0007\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\r\u001a%\u0010\u0007\u001a\u00020\u0013*\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0007\u0010\u0014\u001a\u0013\u0010\u0007\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0007\u0010\u0017\u001a\u0013\u0010\u0007\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u0007\u0010\u001a\u001aM\u0010%\u001a\u00020$*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\b\u0002\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&\u001a-\u0010%\u001a\u00020$*\u00020'2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b%\u0010)\u001a#\u0010%\u001a\u00020$*\u00020*2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0004\b%\u0010+\u001a#\u0010%\u001a\u00020$*\u00020,2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0004\b%\u0010-\u001aC\u0010%\u001a\u00020$*\u00020.2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0000¢\u0006\u0004\b%\u0010/\u001a%\u0010%\u001a\u00020$*\u0002002\u0006\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u00101\u001a\u001b\u00104\u001a\u000203*\n\u0012\u0004\u0012\u000202\u0018\u00010\u0003H\u0002¢\u0006\u0004\b4\u00105\u001a\u0013\u00107\u001a\u000206*\u000202H\u0002¢\u0006\u0004\b7\u00108\u001a\u0015\u0010:\u001a\u0004\u0018\u000109*\u00020\u0001H\u0002¢\u0006\u0004\b:\u0010;\"0\u0010A\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00010=\u0012\u0004\u0012\u00020\u00010\u001f*\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\"0\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00010=\u0012\u0004\u0012\u00020\u00010\u001f*\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@\"0\u0010G\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00010=\u0012\u0004\u0012\u00020\u00010\u001f*\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\"$\u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00010\u001f*\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010I\"$\u0010C\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00010\u001f*\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010I¨\u0006J"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "to", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "", "centerOnly", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Localizations;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$DocumentStartPage;)Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$Pages$UploadOptionsDialog;)Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;", "sessionToken", "inquiryId", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "toInquiryState", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;", "selectedCountryCode", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Complete;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "toPoseConfigs", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "toPoseConfig", "(Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "toSelfiePose", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "getTitleBySide", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;)Ljava/util/Map;", "titleBySide", "getDescriptionBySide", "descriptionBySide", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "getScanInstructionsBySide", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;)Ljava/util/Map;", "scanInstructionsBySide", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;)Ljava/util/Map;", "inquiry-internal_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.internal.network.ConversionsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class Conversions4 {
    private static final Map<String, String> to$overrideIdClassToName(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<String, String> map) {
        ArrayList arrayList;
        Object next;
        String text;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((NextStep.GovernmentId.LocalizationOverride) obj).getPage(), "selectPage")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) next;
                    if (Intrinsics.areEqual(localizationOverride.getCountryCode(), str) && (Intrinsics.areEqual(localizationOverride.getIdClass(), str2) || localizationOverride.getIdClass() == null)) {
                        if (Intrinsics.areEqual(localizationOverride.getKey(), str2)) {
                            break;
                        }
                    }
                }
                NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) next;
                if (localizationOverride2 != null && (text = localizationOverride2.getText()) != null) {
                    str3 = text;
                }
            }
            linkedHashMap.put(key, str3);
        }
        return linkedHashMap;
    }

    private static final OverridableText to$overrideTextBySideAndId(List<NextStep.GovernmentId.LocalizationOverride> list, String str, Map<Tuples2<IdConfig.Side, String>, String> map) {
        ArrayList arrayList;
        ArrayList<NextStep.GovernmentId.LocalizationOverride> arrayList2;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((NextStep.GovernmentId.LocalizationOverride) obj).getPage(), str)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        OverridableText.Builder builder = new OverridableText.Builder();
        for (Map.Entry<Tuples2<IdConfig.Side, String>, String> entry : map.entrySet()) {
            Tuples2<IdConfig.Side, String> key = entry.getKey();
            String value = entry.getValue();
            IdConfig.Side first = key.getFirst();
            String second = key.getSecond();
            if (arrayList != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj2;
                    if (Intrinsics.areEqual(localizationOverride.getSide(), first.getKey()) || localizationOverride.getSide() == null) {
                        if (Intrinsics.areEqual(localizationOverride.getKey(), second)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
            } else {
                arrayList2 = null;
            }
            builder.putText(null, null, first, value);
            if (arrayList2 != null) {
                for (NextStep.GovernmentId.LocalizationOverride localizationOverride2 : arrayList2) {
                    builder.putText(localizationOverride2.getCountryCode(), localizationOverride2.getIdClass(), first, localizationOverride2.getText());
                }
            }
        }
        return builder.build();
    }

    private static final OverridableText to$overrideBySideAndId(List<NextStep.GovernmentId.LocalizationOverride> list, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        EnumEntries<IdConfig.Side> entries = IdConfig.Side.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        Iterator<IdConfig.Side> it = entries.iterator();
        while (it.hasNext()) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(new Tuples2(it.next(), str2), str);
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return to$overrideTextBySideAndId(list, str3, linkedHashMap);
    }

    /* renamed from: to */
    public static final GovernmentIdWorkflow.Input.Strings m3232to(NextStep.GovernmentId.Localizations localizations, String countryCode, List<NextStep.GovernmentId.LocalizationOverride> list) {
        Intrinsics.checkNotNullParameter(localizations, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String title = localizations.getSelectPage().getTitle();
        String prompt = localizations.getSelectPage().getPrompt();
        String choose = localizations.getSelectPage().getChoose();
        String disclaimer = localizations.getSelectPage().getDisclaimer();
        if (disclaimer == null) {
            disclaimer = "";
        }
        OverridableText overridableText = to$overrideBySideAndId(list, localizations.getCapturePage().getTitle(), "title", "capturePage");
        OverridableText overridableText2 = to$overrideTextBySideAndId(list, "capturePage", getScanInstructionsBySide(localizations.getCapturePage()));
        String capturing = localizations.getCapturePage().getCapturing();
        OverridableText overridableText3 = to$overrideBySideAndId(list, localizations.getCapturePage().getConfirmCapture(), "confirmCapture", "capturePage");
        String disclaimer2 = localizations.getCapturePage().getDisclaimer();
        String str = disclaimer2 != null ? disclaimer2 : "";
        String buttonSubmit = localizations.getCheckPage().getButtonSubmit();
        String buttonRetake = localizations.getCheckPage().getButtonRetake();
        OverridableText overridableText4 = to$overrideBySideAndId(list, localizations.getCheckPage().getTitleConfirmCapture(), "titleConfirmCapture", "checkPage");
        String title2 = localizations.getPendingPage().getTitle();
        String description = localizations.getPendingPage().getDescription();
        Map<String, String> map = to$overrideIdClassToName(list, countryCode, localizations.getSelectPage().getIdClassToName());
        OverridableText overridableText5 = to$overrideTextBySideAndId(list, "requestPage", getTitleBySide(localizations.getRequestPage()));
        OverridableText overridableText6 = to$overrideTextBySideAndId(list, "requestPage", getDescriptionBySide(localizations.getRequestPage()));
        String liveUploadButtonText = localizations.getRequestPage().getLiveUploadButtonText();
        String choosePhotoButtonText = localizations.getRequestPage().getChoosePhotoButtonText();
        Map<IdConfig.Side, String> titleBySide = getTitleBySide(localizations.getReviewUploadPage());
        Map<IdConfig.Side, String> descriptionBySide = getDescriptionBySide(localizations.getReviewUploadPage());
        String confirmButtonText = localizations.getReviewUploadPage().getConfirmButtonText();
        String chooseAnotherButtonText = localizations.getReviewUploadPage().getChooseAnotherButtonText();
        String cameraPermissionsTitle = localizations.getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = localizations.getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = localizations.getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = localizations.getPromptPage().getCameraPermissionsCancelButtonText();
        String microphonePermissionsTitle = localizations.getPromptPage().getMicrophonePermissionsTitle();
        String microphonePermissionsPrompt = localizations.getPromptPage().getMicrophonePermissionsPrompt();
        String microphonePermissionsBtnContinueMobile = localizations.getPromptPage().getMicrophonePermissionsBtnContinueMobile();
        String microphonePermissionsBtnCancel = localizations.getPromptPage().getMicrophonePermissionsBtnCancel();
        String hintHoldStill = localizations.getCapturePage().getHintHoldStill();
        String hintLowLight = localizations.getCapturePage().getHintLowLight();
        String btnHelp = localizations.getCapturePage().getBtnHelp();
        String barcodeHelpModalTitle = localizations.getCapturePage().getBarcodeHelpModalTitle();
        String barcodeHelpModalPrompt = localizations.getCapturePage().getBarcodeHelpModalPrompt();
        String barcodeHelpModalHints = localizations.getCapturePage().getBarcodeHelpModalHints();
        String barcodeHelpModalContinueBtn = localizations.getCapturePage().getBarcodeHelpModalContinueBtn();
        String idFrontHelpModalTitle = localizations.getCapturePage().getIdFrontHelpModalTitle();
        String idFrontHelpModalPrompt = localizations.getCapturePage().getIdFrontHelpModalPrompt();
        String idFrontHelpModalHintsMobile = localizations.getCapturePage().getIdFrontHelpModalHintsMobile();
        String idFrontHelpModalContinueBtn = localizations.getCapturePage().getIdFrontHelpModalContinueBtn();
        String idBackHelpModalTitle = localizations.getCapturePage().getIdBackHelpModalTitle();
        String idBackHelpModalPrompt = localizations.getCapturePage().getIdBackHelpModalPrompt();
        String idBackHelpModalHintsMobile = localizations.getCapturePage().getIdBackHelpModalHintsMobile();
        String idBackHelpModalContinueBtn = localizations.getCapturePage().getIdBackHelpModalContinueBtn();
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage = localizations.getAutoClassificationPage();
        String unableToClassifyDocumentTitle = autoClassificationPage != null ? autoClassificationPage.getUnableToClassifyDocumentTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage2 = localizations.getAutoClassificationPage();
        String unableToClassifyDocumentContinueButtonText = autoClassificationPage2 != null ? autoClassificationPage2.getUnableToClassifyDocumentContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage3 = localizations.getAutoClassificationPage();
        String idClassRejectedTitle = autoClassificationPage3 != null ? autoClassificationPage3.getIdClassRejectedTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage4 = localizations.getAutoClassificationPage();
        String idClassRejectedContinueButtonText = autoClassificationPage4 != null ? autoClassificationPage4.getIdClassRejectedContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage5 = localizations.getAutoClassificationPage();
        String countryInputTitle = autoClassificationPage5 != null ? autoClassificationPage5.getCountryInputTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage6 = localizations.getAutoClassificationPage();
        String idClassInputTitle = autoClassificationPage6 != null ? autoClassificationPage6.getIdClassInputTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage7 = localizations.getAutoClassificationPage();
        String manualClassificationTitle = autoClassificationPage7 != null ? autoClassificationPage7.getManualClassificationTitle() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage8 = localizations.getAutoClassificationPage();
        String manualClassificationContinueButtonText = autoClassificationPage8 != null ? autoClassificationPage8.getManualClassificationContinueButtonText() : null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage9 = localizations.getAutoClassificationPage();
        return new GovernmentIdWorkflow.Input.Strings(title, prompt, choose, disclaimer, overridableText, overridableText2, capturing, overridableText3, str, buttonSubmit, buttonRetake, overridableText4, title2, description, map, overridableText5, overridableText6, liveUploadButtonText, choosePhotoButtonText, titleBySide, descriptionBySide, confirmButtonText, chooseAnotherButtonText, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, hintHoldStill, hintLowLight, btnHelp, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueBtn, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHintsMobile, idFrontHelpModalContinueBtn, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHintsMobile, idBackHelpModalContinueBtn, unableToClassifyDocumentTitle, unableToClassifyDocumentContinueButtonText, idClassRejectedTitle, idClassRejectedContinueButtonText, countryInputTitle, idClassInputTitle, manualClassificationTitle, manualClassificationContinueButtonText, autoClassificationPage9 != null ? autoClassificationPage9.getAutoClassificationCaptureTipText() : null, list);
    }

    /* renamed from: to */
    public static final SelfieWorkflow.Input.Strings m3233to(NextStep.Selfie.Localizations localizations, boolean z) {
        String prompt;
        Intrinsics.checkNotNullParameter(localizations, "<this>");
        String title = localizations.getPromptPage().getTitle();
        if (z) {
            prompt = localizations.getPromptPage().getPromptCenter();
        } else {
            prompt = localizations.getPromptPage().getPrompt();
        }
        String str = prompt;
        String disclosure = localizations.getPromptPage().getDisclosure();
        String buttonSubmit = localizations.getPromptPage().getButtonSubmit();
        String title2 = localizations.getCapturePage().getTitle();
        if (title2 == null) {
            title2 = "";
        }
        String str2 = title2;
        String selfieHintTakePhoto = localizations.getCapturePage().getSelfieHintTakePhoto();
        String selfieHintCenterFace = localizations.getCapturePage().getSelfieHintCenterFace();
        String selfieHintFaceTooClose = localizations.getCapturePage().getSelfieHintFaceTooClose();
        String selfieHintFaceTooFar = localizations.getCapturePage().getSelfieHintFaceTooFar();
        String selfieHintFaceIncomplete = localizations.getCapturePage().getSelfieHintFaceIncomplete();
        String selfieHintMultipleFaces = localizations.getCapturePage().getSelfieHintMultipleFaces();
        String selfieHintPoseNotCenter = localizations.getCapturePage().getSelfieHintPoseNotCenter();
        String selfieHintLookLeft = localizations.getCapturePage().getSelfieHintLookLeft();
        String selfieHintLookRight = localizations.getCapturePage().getSelfieHintLookRight();
        String selfieHintHoldStill = localizations.getCapturePage().getSelfieHintHoldStill();
        String title3 = localizations.getPendingPage().getTitle();
        String description = localizations.getPendingPage().getDescription();
        NextStep.Selfie.CheckPage checkPage = localizations.getCheckPage();
        String title4 = checkPage != null ? checkPage.getTitle() : null;
        NextStep.Selfie.CheckPage checkPage2 = localizations.getCheckPage();
        String description2 = checkPage2 != null ? checkPage2.getDescription() : null;
        NextStep.Selfie.CheckPage checkPage3 = localizations.getCheckPage();
        String selfieLabelFront = checkPage3 != null ? checkPage3.getSelfieLabelFront() : null;
        NextStep.Selfie.CheckPage checkPage4 = localizations.getCheckPage();
        String selfieLabelLeft = checkPage4 != null ? checkPage4.getSelfieLabelLeft() : null;
        NextStep.Selfie.CheckPage checkPage5 = localizations.getCheckPage();
        String selfieLabelRight = checkPage5 != null ? checkPage5.getSelfieLabelRight() : null;
        NextStep.Selfie.CheckPage checkPage6 = localizations.getCheckPage();
        String btnSubmit = checkPage6 != null ? checkPage6.getBtnSubmit() : null;
        NextStep.Selfie.CheckPage checkPage7 = localizations.getCheckPage();
        return new SelfieWorkflow.Input.Strings(title, str, disclosure, buttonSubmit, str2, selfieHintTakePhoto, selfieHintCenterFace, selfieHintFaceTooClose, selfieHintFaceTooFar, selfieHintMultipleFaces, selfieHintFaceIncomplete, selfieHintPoseNotCenter, selfieHintLookLeft, selfieHintLookRight, selfieHintHoldStill, title3, description, title4, description2, selfieLabelFront, selfieLabelLeft, selfieLabelRight, btnSubmit, checkPage7 != null ? checkPage7.getBtnRetake() : null, localizations.getCapturePage().getAutoCaptureOn(), localizations.getCapturePage().getCaptureSuccess(), localizations.getCapturePage().getSelfieHintCenterFaceDescription(), localizations.getCapturePage().getSelfieHintLookLeftDescription(), localizations.getCapturePage().getSelfieHintLookRightDescription(), localizations.getCapturePage().getCameraLoadingTitle());
    }

    /* renamed from: to */
    public static final DocumentPages m3229to(NextStep.Document.Pages pages, NextStep.Document.Localizations localizations, StepStyles.DocumentStepStyle documentStepStyle) {
        StepStyles.DocumentStepStyle documentStepStyle2;
        DocumentPages2 documentPages2MakeDefault;
        DocumentPages3 documentPages3MakeDefault;
        NextStep.Document.Pages.DocumentPages document;
        NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog;
        NextStep.Document.Pages.DocumentPages document2;
        NextStep.Document.Pages.DocumentStartPage prompt;
        Intrinsics.checkNotNullParameter(localizations, "localizations");
        if (pages == null || (document2 = pages.getDocument()) == null || (prompt = document2.getPrompt()) == null || (documentPages2MakeDefault = m3230to(prompt)) == null) {
            documentStepStyle2 = documentStepStyle;
            documentPages2MakeDefault = DocumentPages2.INSTANCE.makeDefault(localizations.getPromptPage().getTitle(), localizations.getPromptPage().getPrompt(), localizations.getPromptPage().getBtnUpload(), localizations.getPromptPage().getBtnCapture(), documentStepStyle2);
        } else {
            documentStepStyle2 = documentStepStyle;
        }
        if (pages == null || (document = pages.getDocument()) == null || (uploadOptionsDialog = document.getUploadOptionsDialog()) == null || (documentPages3MakeDefault = m3231to(uploadOptionsDialog)) == null) {
            documentPages3MakeDefault = DocumentPages3.INSTANCE.makeDefault(localizations.getPromptPage().getCaptureOptionsDialogTitle(), localizations.getPromptPage().getBtnCapture(), localizations.getPromptPage().getBtnUpload(), documentStepStyle2);
        }
        return new DocumentPages(documentPages2MakeDefault, documentPages3MakeDefault);
    }

    /* renamed from: to */
    private static final DocumentPages2 m3230to(NextStep.Document.Pages.DocumentStartPage documentStartPage) {
        List<UiComponentConfig> components = documentStartPage.getUiStep().getConfig().getComponents();
        List<UiComponent> listM3260to = components != null ? UiComponent3.m3260to(components) : null;
        List<UiComponentConfig> components2 = documentStartPage.getUiStep().getConfig().getComponents();
        if (components2 == null) {
            components2 = CollectionsKt.emptyList();
        }
        List<UiComponentConfig> list = components2;
        StepStyles.UiStepStyle styles = documentStartPage.getUiStep().getStyles();
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping = documentStartPage.getComponentNameMapping();
        String buttonPhotoLibrary = componentNameMapping != null ? componentNameMapping.getButtonPhotoLibrary() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping2 = documentStartPage.getComponentNameMapping();
        String buttonFilePicker = componentNameMapping2 != null ? componentNameMapping2.getButtonFilePicker() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping3 = documentStartPage.getComponentNameMapping();
        String buttonCamera = componentNameMapping3 != null ? componentNameMapping3.getButtonCamera() : null;
        NextStep.Document.Pages.DocumentStartPage.ComponentNameMapping componentNameMapping4 = documentStartPage.getComponentNameMapping();
        return new DocumentPages2(listM3260to, list, styles, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonUploadOptions() : null);
    }

    /* renamed from: to */
    private static final DocumentPages3 m3231to(NextStep.Document.Pages.UploadOptionsDialog uploadOptionsDialog) {
        List<UiComponentConfig> components = uploadOptionsDialog.getUiStep().getConfig().getComponents();
        List<UiComponent> listM3260to = components != null ? UiComponent3.m3260to(components) : null;
        List<UiComponentConfig> components2 = uploadOptionsDialog.getUiStep().getConfig().getComponents();
        if (components2 == null) {
            components2 = CollectionsKt.emptyList();
        }
        List<UiComponentConfig> list = components2;
        StepStyles.UiStepStyle styles = uploadOptionsDialog.getUiStep().getStyles();
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping = uploadOptionsDialog.getComponentNameMapping();
        String buttonPhotoLibrary = componentNameMapping != null ? componentNameMapping.getButtonPhotoLibrary() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping2 = uploadOptionsDialog.getComponentNameMapping();
        String buttonFilePicker = componentNameMapping2 != null ? componentNameMapping2.getButtonFilePicker() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping3 = uploadOptionsDialog.getComponentNameMapping();
        String buttonCamera = componentNameMapping3 != null ? componentNameMapping3.getButtonCamera() : null;
        NextStep.Document.Pages.UploadOptionsDialog.ComponentNameMapping componentNameMapping4 = uploadOptionsDialog.getComponentNameMapping();
        return new DocumentPages3(listM3260to, list, styles, buttonFilePicker, buttonPhotoLibrary, buttonCamera, componentNameMapping4 != null ? componentNameMapping4.getButtonCancel() : null);
    }

    public static final InquiryState toInquiryState(NextStep.C43686Ui c43686Ui, String sessionToken, String inquiryId, String str, Map<String, ? extends InquiryField> map, InquirySessionConfig inquirySessionConfig) {
        Intrinsics.checkNotNullParameter(c43686Ui, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String str2 = str == null ? "" : str;
        String name = c43686Ui.getName();
        List<UiComponentConfig> components = c43686Ui.getConfig().getComponents();
        if (components == null) {
            components = CollectionsKt.emptyList();
        }
        List<UiComponentConfig> list = components;
        Boolean backStepEnabled = c43686Ui.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = c43686Ui.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        Boolean terminal = c43686Ui.getConfig().getTerminal();
        boolean zBooleanValue3 = terminal != null ? terminal.booleanValue() : false;
        Map<String, ? extends InquiryField> mapEmptyMap = map == null ? MapsKt.emptyMap() : map;
        StepStyles.UiStepStyle styles = c43686Ui.getStyles();
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        NextStep.C43686Ui.Localizations localizations = c43686Ui.getConfig().getLocalizations();
        return new InquiryState.UiStepRunning(inquiryId, sessionToken, null, styles, localizations != null ? localizations.getCancelDialog() : null, c43686Ui.getConfig().getLocalizations(), str2, name, list, zBooleanValue, zBooleanValue2, zBooleanValue3, mapEmptyMap, string2, c43686Ui.getConfig().getServerComponentErrors(), null, inquirySessionConfig, false, 32772, null);
    }

    public static final InquiryState toInquiryState(NextStep.GovernmentId governmentId, String sessionToken, String inquiryId, String str) {
        Intrinsics.checkNotNullParameter(governmentId, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Long nativeMobileCameraManualCaptureDelayMs = governmentId.getConfig().getNativeMobileCameraManualCaptureDelayMs();
        long jLongValue = nativeMobileCameraManualCaptureDelayMs != null ? nativeMobileCameraManualCaptureDelayMs.longValue() : 8000L;
        List<Id> idclasses = governmentId.getConfig().getIdclasses();
        if (idclasses == null) {
            idclasses = CollectionsKt.emptyList();
        }
        List<Id> list = idclasses;
        String name = governmentId.getName();
        String name2 = governmentId.getName();
        Boolean backStepEnabled = governmentId.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = governmentId.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        NextStep.GovernmentId.Localizations localizations = governmentId.getConfig().getLocalizations();
        List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides = governmentId.getConfig().getLocalizationOverrides();
        List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile = governmentId.getConfig().getEnabledCaptureOptionsNativeMobile();
        if (enabledCaptureOptionsNativeMobile == null) {
            enabledCaptureOptionsNativeMobile = CollectionsKt.listOf(CaptureOptionNativeMobile.MOBILE_CAMERA);
        }
        List<CaptureOptionNativeMobile> list2 = enabledCaptureOptionsNativeMobile;
        StepStyles.GovernmentIdStepStyle styles = governmentId.getStyles();
        Integer imageCaptureCount = governmentId.getConfig().getImageCaptureCount();
        int iIntValue = imageCaptureCount != null ? imageCaptureCount.intValue() : 3;
        String fieldKeyDocument = governmentId.getConfig().getFieldKeyDocument();
        String fieldKeyIdclass = governmentId.getConfig().getFieldKeyIdclass();
        NextStep.CancelDialog cancelDialog = governmentId.getConfig().getLocalizations().getCancelDialog();
        Boolean shouldSkipReviewScreen = governmentId.getConfig().getShouldSkipReviewScreen();
        boolean zBooleanValue3 = shouldSkipReviewScreen != null ? shouldSkipReviewScreen.booleanValue() : false;
        List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes = governmentId.getConfig().getEnabledCaptureFileTypes();
        if (enabledCaptureFileTypes == null) {
            enabledCaptureFileTypes = CollectionsKt.emptyList();
        }
        List<NextStep.GovernmentId.CaptureFileType> list3 = enabledCaptureFileTypes;
        List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods = governmentId.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = CollectionsKt.emptyList();
        }
        List<NextStep.GovernmentId.VideoCaptureMethod> list4 = videoCaptureMethods;
        String videoSessionJwt = governmentId.getConfig().getVideoSessionJwt();
        NextStep.GovernmentId.AssetConfig assets = governmentId.getConfig().getAssets();
        AutoClassificationConfig autoClassificationConfigM3220to = Conversions3.m3220to(governmentId.getConfig().getAutoClassificationConfig(), jLongValue);
        StyleElements.Axis reviewCaptureButtonsAxis = governmentId.getConfig().getReviewCaptureButtonsAxis();
        if (reviewCaptureButtonsAxis == null) {
            reviewCaptureButtonsAxis = StyleElements.Axis.HORIZONTAL;
        }
        StyleElements.Axis axis = reviewCaptureButtonsAxis;
        PendingPageTextPosition pendingPageTextVerticalPosition = governmentId.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPosition2.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = governmentId.getConfig().getAudioEnabled();
        return new InquiryState.GovernmentIdStepRunning(inquiryId, sessionToken, null, styles, cancelDialog, str, list, name, name2, zBooleanValue, zBooleanValue2, localizations, localizationOverrides, list2, iIntValue, jLongValue, fieldKeyDocument, fieldKeyIdclass, zBooleanValue3, list3, list4, videoSessionJwt, assets, autoClassificationConfigM3220to, axis, pendingPageTextPosition, audioEnabled != null ? audioEnabled.booleanValue() : true, null, 4, null);
    }

    public static final InquiryState toInquiryState(NextStep.Selfie selfie, String sessionToken, String inquiryId) {
        DesignVersion designVersion;
        Integer designVersion2;
        Intrinsics.checkNotNullParameter(selfie, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        NextStep.Selfie.CaptureMethod selfieType = selfie.getConfig().getSelfieType();
        String name = selfie.getName();
        String name2 = selfie.getName();
        Boolean backStepEnabled = selfie.getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = selfie.getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String fieldKeySelfie = selfie.getConfig().getFieldKeySelfie();
        boolean requireStrictSelfieCapture = selfie.getConfig().getRequireStrictSelfieCapture();
        Boolean skipPromptPage = selfie.getConfig().getSkipPromptPage();
        boolean zBooleanValue3 = skipPromptPage != null ? skipPromptPage.booleanValue() : false;
        NextStep.Selfie.Localizations localizations = selfie.getConfig().getLocalizations();
        boolean zBooleanValue4 = true;
        StepStyles.SelfieStepStyle styles = selfie.getStyles();
        NextStep.CancelDialog cancelDialog = selfie.getConfig().getLocalizations().getCancelDialog();
        List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes = selfie.getConfig().getEnabledCaptureFileTypes();
        if (enabledCaptureFileTypes == null) {
            enabledCaptureFileTypes = CollectionsKt.emptyList();
        }
        List<NextStep.Selfie.CaptureFileType> list = enabledCaptureFileTypes;
        List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods = selfie.getConfig().getVideoCaptureMethods();
        if (videoCaptureMethods == null) {
            videoCaptureMethods = CollectionsKt.emptyList();
        }
        List<NextStep.Selfie.VideoCaptureMethod> list2 = videoCaptureMethods;
        NextStep.Selfie.AssetConfig assets = selfie.getConfig().getAssets();
        String videoSessionJwt = selfie.getConfig().getVideoSessionJwt();
        List<NextStep.Selfie.SelfiePose> orderedPoses = selfie.getConfig().getOrderedPoses();
        PendingPageTextPosition pendingPageTextVerticalPosition = selfie.getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPosition2.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        PendingPageTextPosition pendingPageTextPosition = pendingPageTextVerticalPosition;
        Boolean audioEnabled = selfie.getConfig().getAudioEnabled();
        if (audioEnabled != null) {
            zBooleanValue4 = audioEnabled.booleanValue();
        }
        boolean z = zBooleanValue4;
        PoseConfigs poseConfigs = toPoseConfigs(selfie.getConfig().getPoseConfigs());
        if (selfie.getConfig().getDesignVersion() == null || ((designVersion2 = selfie.getConfig().getDesignVersion()) != null && designVersion2.intValue() == 0)) {
            designVersion = DesignVersion.f6512V0;
        } else {
            designVersion = DesignVersion.f6513V1;
        }
        return new InquiryState.SelfieStepRunning(inquiryId, sessionToken, null, styles, cancelDialog, selfieType, name, name2, zBooleanValue, zBooleanValue2, fieldKeySelfie, requireStrictSelfieCapture, zBooleanValue3, localizations, list, list2, assets, videoSessionJwt, orderedPoses, pendingPageTextPosition, z, poseConfigs, designVersion, 4, null);
    }

    public static final InquiryState toInquiryState(NextStep.Document document, String sessionToken, String inquiryId) {
        Intrinsics.checkNotNullParameter(document, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        return new InquiryState.DocumentStepRunning(inquiryId, sessionToken, null, document.getStyles(), document.getConfig().getLocalizations().getCancelDialog(), document, document.getName(), m3229to(document.getConfig().getPages(), document.getConfig().getLocalizations(), document.getStyles()), document.getConfig().getAssets(), document.getName(), 4, null);
    }

    public static final InquiryState toInquiryState(NextStep.Complete complete, String sessionToken, String inquiryId, String str, Map<String, ? extends InquiryField> map) {
        Intrinsics.checkNotNullParameter(complete, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        return new InquiryState.Complete(inquiryId, sessionToken, null, str2, map, 4, null);
    }

    private static final Map<Tuples2<IdConfig.Side, String>, String> getTitleBySide(NextStep.GovernmentId.RequestPage requestPage) {
        return MapsKt.mapOf(Tuples4.m3642to(new Tuples2(IdConfig.Side.Front, "titleFront"), requestPage.getTitleFront()), Tuples4.m3642to(new Tuples2(IdConfig.Side.Back, "titleBack"), requestPage.getTitleBack()), Tuples4.m3642to(new Tuples2(IdConfig.Side.BarcodePdf417, "titlePdf417"), requestPage.getTitlePdf417()), Tuples4.m3642to(new Tuples2(IdConfig.Side.PassportSignature, "titlePassportSignature"), requestPage.getTitlePassportSignature()));
    }

    private static final Map<Tuples2<IdConfig.Side, String>, String> getDescriptionBySide(NextStep.GovernmentId.RequestPage requestPage) {
        return MapsKt.mapOf(Tuples4.m3642to(new Tuples2(IdConfig.Side.Front, "descriptionFront"), requestPage.getDescriptionFront()), Tuples4.m3642to(new Tuples2(IdConfig.Side.Back, "descriptionBack"), requestPage.getDescriptionBack()), Tuples4.m3642to(new Tuples2(IdConfig.Side.BarcodePdf417, "descriptionPdf417"), requestPage.getDescriptionPdf417()), Tuples4.m3642to(new Tuples2(IdConfig.Side.PassportSignature, "descriptionPassportSignature"), requestPage.getDescriptionPassportSignature()));
    }

    private static final Map<Tuples2<IdConfig.Side, String>, String> getScanInstructionsBySide(NextStep.GovernmentId.CapturePage capturePage) {
        return MapsKt.mapOf(Tuples4.m3642to(new Tuples2(IdConfig.Side.Front, "scanFront"), capturePage.getScanFront()), Tuples4.m3642to(new Tuples2(IdConfig.Side.Back, "scanBack"), capturePage.getScanBack()), Tuples4.m3642to(new Tuples2(IdConfig.Side.BarcodePdf417, "scanPdf417"), capturePage.getScanPdf417()), Tuples4.m3642to(new Tuples2(IdConfig.Side.PassportSignature, "scanSignature"), capturePage.getScanSignature()), Tuples4.m3642to(new Tuples2(IdConfig.Side.FrontOrBack, "scanFrontOrBack"), capturePage.getScanFrontOrBack()));
    }

    private static final Map<IdConfig.Side, String> getTitleBySide(NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        return MapsKt.mapOf(Tuples4.m3642to(IdConfig.Side.Front, reviewUploadPage.getTitleFront()), Tuples4.m3642to(IdConfig.Side.Back, reviewUploadPage.getTitleBack()), Tuples4.m3642to(IdConfig.Side.BarcodePdf417, reviewUploadPage.getTitlePdf417()), Tuples4.m3642to(IdConfig.Side.PassportSignature, reviewUploadPage.getTitlePassportSignature()));
    }

    private static final Map<IdConfig.Side, String> getDescriptionBySide(NextStep.GovernmentId.ReviewUploadPage reviewUploadPage) {
        return MapsKt.mapOf(Tuples4.m3642to(IdConfig.Side.Front, reviewUploadPage.getDescriptionFront()), Tuples4.m3642to(IdConfig.Side.Back, reviewUploadPage.getDescriptionBack()), Tuples4.m3642to(IdConfig.Side.BarcodePdf417, reviewUploadPage.getDescriptionPdf417()), Tuples4.m3642to(IdConfig.Side.PassportSignature, reviewUploadPage.getDescriptionPassportSignature()));
    }

    public static final InquiryState toInquiryState(CheckInquiryResponse checkInquiryResponse, String sessionToken, InquirySessionConfig inquirySessionConfig) {
        Intrinsics.checkNotNullParameter(checkInquiryResponse, "<this>");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquirySessionConfig, "inquirySessionConfig");
        String id = checkInquiryResponse.getData().getId();
        NextStep nextStep = checkInquiryResponse.getData().getAttributes().getNextStep();
        if (nextStep instanceof NextStep.C43686Ui) {
            return toInquiryState((NextStep.C43686Ui) nextStep, sessionToken, id, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields(), inquirySessionConfig);
        }
        if (nextStep instanceof NextStep.GovernmentId) {
            return toInquiryState((NextStep.GovernmentId) nextStep, sessionToken, id, checkInquiryResponse.getData().getAttributes().getSelectedCountryCode());
        }
        if (nextStep instanceof NextStep.Selfie) {
            return toInquiryState((NextStep.Selfie) nextStep, sessionToken, id);
        }
        if (nextStep instanceof NextStep.Document) {
            return toInquiryState((NextStep.Document) nextStep, sessionToken, id);
        }
        if (nextStep instanceof NextStep.Complete) {
            return toInquiryState((NextStep.Complete) nextStep, sessionToken, id, checkInquiryResponse.getData().getAttributes().getStatus(), checkInquiryResponse.getData().getAttributes().getFields());
        }
        if (!Intrinsics.areEqual(nextStep, NextStep.Unknown.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Unknown type for step " + nextStep.getName());
    }

    private static final PoseConfigs toPoseConfigs(List<PoseConfig> list) {
        Selfie.Pose selfiePose;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        for (PoseConfig poseConfig : list) {
            String pose = poseConfig.getPose();
            if (pose != null && (selfiePose = toSelfiePose(pose)) != null) {
                linkedHashMap.put(selfiePose, toPoseConfig(poseConfig));
            }
        }
        return new PoseConfigs(linkedHashMap);
    }

    private static final com.withpersona.sdk2.inquiry.selfie.PoseConfig toPoseConfig(PoseConfig poseConfig) {
        com.withpersona.sdk2.inquiry.selfie.PoseConfig poseConfig2 = com.withpersona.sdk2.inquiry.selfie.PoseConfig.INSTANCE.getDefault();
        Boolean allowReview = poseConfig.getAllowReview();
        boolean zBooleanValue = allowReview != null ? allowReview.booleanValue() : poseConfig2.getAllowReview();
        Boolean manualCaptureEnabled = poseConfig.getManualCaptureEnabled();
        boolean zBooleanValue2 = manualCaptureEnabled != null ? manualCaptureEnabled.booleanValue() : poseConfig2.getManualCaptureEnabled();
        Long manualCaptureDelayMs = poseConfig.getManualCaptureDelayMs();
        long jLongValue = manualCaptureDelayMs != null ? manualCaptureDelayMs.longValue() : poseConfig2.getManualCaptureDelayMs();
        Boolean autoCaptureEnabled = poseConfig.getAutoCaptureEnabled();
        return new com.withpersona.sdk2.inquiry.selfie.PoseConfig(zBooleanValue, zBooleanValue2, jLongValue, autoCaptureEnabled != null ? autoCaptureEnabled.booleanValue() : poseConfig2.getAutoCaptureEnabled());
    }

    private static final Selfie.Pose toSelfiePose(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1364013995) {
            if (str.equals("center")) {
                return Selfie.Pose.Center;
            }
            return null;
        }
        if (iHashCode == 3317767) {
            if (str.equals("left")) {
                return Selfie.Pose.Left;
            }
            return null;
        }
        if (iHashCode == 108511772 && str.equals("right")) {
            return Selfie.Pose.Right;
        }
        return null;
    }
}
