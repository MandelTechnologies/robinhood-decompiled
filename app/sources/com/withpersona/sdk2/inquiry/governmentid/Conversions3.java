package com.withpersona.sdk2.inquiry.governmentid;

import com.robinhood.iso.countrycode.CountryCode;
import com.withpersona.sdk2.camera.AamvaExtraction;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.AutoCaptureRuleSet;
import com.withpersona.sdk2.camera.BarcodeInfo;
import com.withpersona.sdk2.camera.ExtractedTexts;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig2;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Conversions.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a.\u0010\u0007\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0001\u001a\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0015H\u0002\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0018*\u00020\u0019H\u0002\u001a\f\u0010\u0007\u001a\u00020\u001a*\u00020\u001bH\u0002\u001a\u000e\u0010\u001c\u001a\u00020\u001d*\u0004\u0018\u00010\u001eH\u0002\u001a\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\"\u0010 \u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\n\u0010\"\u001a\u00020#*\u00020$\u001a\n\u0010\"\u001a\u00020#*\u00020%\u001a\u0014\u0010\u0007\u001a\u00020&*\u0004\u0018\u00010'2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006("}, m3636d2 = {"toIdConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "countryCode", "", "defaultManualCaptureDelayMs", "", "to", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "type", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$ManualCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "defaultManualCaptureDelay", "getDefaultManualCaptureConfig", "Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "isRuleSetSupported", "", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "toIcon", "Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "getAutoCaptureConfigForSide", "getOverlay", "currentSide", "toGovIdDetails", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Lcom/withpersona/sdk2/camera/ExtractedTexts;", "Lcom/withpersona/sdk2/camera/BarcodeInfo;", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.ConversionsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class Conversions3 {

    /* compiled from: Conversions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.ConversionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CapturePageConfig.RuleType.values().length];
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CapturePageConfig.RuleType.ID_FRONT_OR_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CapturePageConfig.RuleType.BARCODE_PDF417.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CapturePageConfig.RuleType.PASSPORT_MRZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CapturePageConfig.RuleType.TEXT_EXTRACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CapturePageConfig.OverlayLocalIcon.values().length];
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.BARCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.ID_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.CORNERS_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CapturePageConfig.OverlayLocalIcon.EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Id.IdLocalIcon.values().length];
            try {
                iArr3[Id.IdLocalIcon.WORLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Id.IdLocalIcon.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Id.IdLocalIcon.FLAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Id.IdLocalIcon.HOUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[IdConfig.Side.values().length];
            try {
                iArr4[IdConfig.Side.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[IdConfig.Side.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[IdConfig.Side.BarcodePdf417.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[IdConfig.Side.FrontOrBack.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[IdConfig.Side.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final IdConfig toIdConfig(Id id, String countryCode, long j) {
        IdIcon icon;
        String str;
        long j2;
        IdConfig.IdSideConfig idSideConfigM3217to;
        Intrinsics.checkNotNullParameter(id, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        IdClass idClassFromAbbreviation = IdClass.INSTANCE.fromAbbreviation(id.getClass());
        if (idClassFromAbbreviation == IdClass.Unknown && !id.isDynamicGovId()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CapturePageConfig> capturePageConfigs = id.getCapturePageConfigs();
        if (capturePageConfigs != null) {
            for (CapturePageConfig capturePageConfig : capturePageConfigs) {
                String side = capturePageConfig.getSide();
                if (side != null) {
                    linkedHashMap.put(side, capturePageConfig);
                }
            }
        }
        List<String> requiresSides = id.getRequiresSides();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(requiresSides, 10));
        for (String str2 : requiresSides) {
            IdConfig.Side sideFromSideKey = IdConfig.Side.INSTANCE.fromSideKey(str2);
            if (sideFromSideKey == null || (idSideConfigM3217to = m3217to((CapturePageConfig) linkedHashMap.get(str2), sideFromSideKey, idClassFromAbbreviation, (str = countryCode), (j2 = j))) == null) {
                return null;
            }
            arrayList.add(idSideConfigM3217to);
            countryCode = str;
            j = j2;
        }
        String str3 = id.getClass();
        if (id.isDynamicGovId()) {
            Id.IdIcon icon2 = id.getIcon();
            icon = toIcon(icon2 != null ? icon2.getIconFallback() : null);
        } else {
            icon = idClassFromAbbreviation.toIcon();
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new IdConfig2.SideIdPart(((IdConfig.IdSideConfig) it.next()).getSide()));
        }
        return new IdConfig(str3, icon, arrayList, arrayList2, idClassFromAbbreviation);
    }

    /* renamed from: to */
    public static final IdConfig.IdSideConfig m3217to(CapturePageConfig capturePageConfig, IdConfig.Side side, IdClass type2, String countryCode, long j) {
        IdConfig.AutoCaptureConfig autoCaptureConfigForSide;
        IdConfig.ManualCaptureConfig defaultManualCaptureConfig;
        GovernmentIdScreen2.Overlay overlay;
        CapturePageConfig.OverlayConfig overlay2;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig;
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (capturePageConfig == null || (autoCaptureConfig = capturePageConfig.getAutoCaptureConfig()) == null || (autoCaptureConfigForSide = m3216to(autoCaptureConfig)) == null) {
            autoCaptureConfigForSide = getAutoCaptureConfigForSide(side);
        }
        if (capturePageConfig == null || (manualCaptureConfig = capturePageConfig.getManualCaptureConfig()) == null || (defaultManualCaptureConfig = m3218to(manualCaptureConfig, j)) == null) {
            defaultManualCaptureConfig = getDefaultManualCaptureConfig(j);
        }
        IdConfig.ManualCaptureConfig manualCaptureConfig2 = defaultManualCaptureConfig;
        if (autoCaptureConfigForSide.getRuleSet().getRules().isEmpty() && !manualCaptureConfig2.getIsEnabled()) {
            return null;
        }
        String key = side.getKey();
        if (capturePageConfig == null || (overlay2 = capturePageConfig.getOverlay()) == null || (overlay = m3219to(overlay2)) == null) {
            overlay = getOverlay(type2, side, countryCode);
        }
        return new IdConfig.IdSideConfig(key, side, overlay, autoCaptureConfigForSide, manualCaptureConfig2);
    }

    /* renamed from: to */
    public static final IdConfig.AutoCaptureConfig m3216to(CapturePageConfig.AutoCaptureConfig autoCaptureConfig) {
        Object next;
        Intrinsics.checkNotNullParameter(autoCaptureConfig, "<this>");
        List<CapturePageConfig.RuleSet> ruleSets = autoCaptureConfig.getRuleSets();
        if (ruleSets == null) {
            return null;
        }
        if (ruleSets.isEmpty()) {
            return new IdConfig.AutoCaptureConfig(null, 1, null);
        }
        Iterator<T> it = ruleSets.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (isRuleSetSupported((CapturePageConfig.RuleSet) next)) {
                break;
            }
        }
        CapturePageConfig.RuleSet ruleSet = (CapturePageConfig.RuleSet) next;
        if (ruleSet == null) {
            return new IdConfig.AutoCaptureConfig(null, 1, null);
        }
        return new IdConfig.AutoCaptureConfig(m3215to(ruleSet));
    }

    /* renamed from: to */
    public static final IdConfig.ManualCaptureConfig m3218to(CapturePageConfig.ManualCaptureConfig manualCaptureConfig, long j) {
        Intrinsics.checkNotNullParameter(manualCaptureConfig, "<this>");
        Boolean boolIsEnabled = manualCaptureConfig.isEnabled();
        boolean zBooleanValue = boolIsEnabled != null ? boolIsEnabled.booleanValue() : true;
        Long delayMs = manualCaptureConfig.getDelayMs();
        if (delayMs != null) {
            j = delayMs.longValue();
        }
        return new IdConfig.ManualCaptureConfig(zBooleanValue, j);
    }

    private static final IdConfig.ManualCaptureConfig getDefaultManualCaptureConfig(long j) {
        return new IdConfig.ManualCaptureConfig(true, j);
    }

    /* renamed from: to */
    private static final AutoCaptureRuleSet m3215to(CapturePageConfig.RuleSet ruleSet) {
        List listEmptyList;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            Iterator<T> it = rules.iterator();
            while (it.hasNext()) {
                AutoCaptureRule autoCaptureRuleM3214to = m3214to((CapturePageConfig.Rule) it.next());
                if (autoCaptureRuleM3214to != null) {
                    listEmptyList.add(autoCaptureRuleM3214to);
                }
            }
        }
        return new AutoCaptureRuleSet(listEmptyList);
    }

    private static final boolean isRuleSetSupported(CapturePageConfig.RuleSet ruleSet) {
        boolean z;
        boolean z2;
        List<CapturePageConfig.Rule> rules = ruleSet.getRules();
        if (rules != null) {
            z = true;
            z2 = false;
            for (CapturePageConfig.Rule rule : rules) {
                if (Intrinsics.areEqual(rule.isRequired(), Boolean.TRUE) && rule.getType() == null) {
                    z = false;
                } else if (rule.getType() != null) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
        }
        return z && z2;
    }

    /* renamed from: to */
    private static final AutoCaptureRule m3214to(CapturePageConfig.Rule rule) {
        CapturePageConfig.RuleType type2 = rule.getType();
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return new AutoCaptureRule.FrontRule(Intrinsics.areEqual(rule.isRequired(), Boolean.TRUE));
        }
        if (i == 2) {
            return new AutoCaptureRule.FrontOrBackRule(Intrinsics.areEqual(rule.isRequired(), Boolean.TRUE));
        }
        if (i == 3) {
            return new AutoCaptureRule.BarcodePdf417Rule(Intrinsics.areEqual(rule.isRequired(), Boolean.TRUE));
        }
        if (i == 4) {
            return new AutoCaptureRule.MrzRule(Intrinsics.areEqual(rule.isRequired(), Boolean.TRUE));
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return new AutoCaptureRule.TextExtractionRule(Intrinsics.areEqual(rule.isRequired(), Boolean.TRUE));
    }

    /* renamed from: to */
    private static final GovernmentIdScreen2.Overlay m3219to(CapturePageConfig.OverlayConfig overlayConfig) {
        RemoteImage overlay = overlayConfig.getOverlay();
        if (overlay != null) {
            return new GovernmentIdScreen2.Overlay.Custom(overlay);
        }
        CapturePageConfig.OverlayLocalIcon overlayFallback = overlayConfig.getOverlayFallback();
        switch (overlayFallback == null ? -1 : WhenMappings.$EnumSwitchMapping$1[overlayFallback.ordinal()]) {
            case -1:
                return GovernmentIdScreen2.Overlay.Rectangle.INSTANCE;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return GovernmentIdScreen2.Overlay.Barcode.INSTANCE;
            case 2:
                return GovernmentIdScreen2.Overlay.Passport.INSTANCE;
            case 3:
                return GovernmentIdScreen2.Overlay.GenericFront.INSTANCE;
            case 4:
                return GovernmentIdScreen2.Overlay.Barcode.INSTANCE;
            case 5:
                return GovernmentIdScreen2.Overlay.CornersOnly.INSTANCE;
            case 6:
                return GovernmentIdScreen2.Overlay.Rectangle.INSTANCE;
        }
    }

    private static final IdIcon toIcon(Id.IdLocalIcon idLocalIcon) {
        int i = idLocalIcon == null ? -1 : WhenMappings.$EnumSwitchMapping$2[idLocalIcon.ordinal()];
        if (i == -1) {
            return IdIcon.Card;
        }
        if (i == 1) {
            return IdIcon.World;
        }
        if (i == 2) {
            return IdIcon.Card;
        }
        if (i == 3) {
            return IdIcon.Flag;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return IdIcon.House;
    }

    private static final IdConfig.AutoCaptureConfig getAutoCaptureConfigForSide(IdConfig.Side side) {
        int i = WhenMappings.$EnumSwitchMapping$3[side.ordinal()];
        if (i == 1) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt.listOf(new AutoCaptureRule.FrontRule(false, 1, null))));
        }
        if (i == 2) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt.listOf(new AutoCaptureRule.BarcodePdf417Rule(false, 1, null))));
        }
        if (i == 3) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt.listOf(new AutoCaptureRule.BarcodePdf417Rule(false, 1, null))));
        }
        if (i == 4) {
            return new IdConfig.AutoCaptureConfig(new AutoCaptureRuleSet(CollectionsKt.listOf(new AutoCaptureRule.FrontOrBackRule(false, 1, null))));
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return new IdConfig.AutoCaptureConfig(null, 1, null);
    }

    private static final GovernmentIdScreen2.Overlay getOverlay(IdClass idClass, IdConfig.Side side, String str) {
        if (side == IdConfig.Side.BarcodePdf417) {
            return GovernmentIdScreen2.Overlay.Barcode.INSTANCE;
        }
        if (side == IdConfig.Side.PassportSignature) {
            return GovernmentIdScreen2.Overlay.Rectangle.INSTANCE;
        }
        IdClass idClass2 = IdClass.DriverLicense;
        if (idClass == idClass2 && side == IdConfig.Side.Back && Intrinsics.areEqual(str, CountryCode.COUNTRY_CODE_US)) {
            return GovernmentIdScreen2.Overlay.Barcode.INSTANCE;
        }
        if (idClass != IdClass.Passport && idClass != IdClass.Visa) {
            if (idClass == idClass2) {
                return GovernmentIdScreen2.Overlay.GenericFront.INSTANCE;
            }
            if (idClass != IdClass.StateID && idClass != IdClass.ResidencyPermit) {
                return GovernmentIdScreen2.Overlay.Rectangle.INSTANCE;
            }
            return GovernmentIdScreen2.Overlay.GenericFront.INSTANCE;
        }
        return GovernmentIdScreen2.Overlay.Passport.INSTANCE;
    }

    public static final GovernmentIdDetails toGovIdDetails(ExtractedTexts extractedTexts) {
        Intrinsics.checkNotNullParameter(extractedTexts, "<this>");
        return new GovernmentIdDetails(extractedTexts.getDateOfBirth(), extractedTexts.getExpirationDate());
    }

    public static final GovernmentIdDetails toGovIdDetails(BarcodeInfo barcodeInfo) {
        Intrinsics.checkNotNullParameter(barcodeInfo, "<this>");
        if (barcodeInfo instanceof BarcodeInfo.MrzBarcodeInfo) {
            BarcodeInfo.MrzBarcodeInfo mrzBarcodeInfo = (BarcodeInfo.MrzBarcodeInfo) barcodeInfo;
            return new GovernmentIdDetails(mrzBarcodeInfo.getBirthdate(), mrzBarcodeInfo.getExpirationDate());
        }
        if (!(barcodeInfo instanceof BarcodeInfo.Pdf417BarcodeInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        BarcodeInfo.Pdf417BarcodeInfo pdf417BarcodeInfo = (BarcodeInfo.Pdf417BarcodeInfo) barcodeInfo;
        AamvaExtraction aamvaExtractionValues = pdf417BarcodeInfo.values();
        Date birthdate = aamvaExtractionValues != null ? aamvaExtractionValues.getBirthdate() : null;
        AamvaExtraction aamvaExtractionValues2 = pdf417BarcodeInfo.values();
        return new GovernmentIdDetails(birthdate, aamvaExtractionValues2 != null ? aamvaExtractionValues2.getExpirationDate() : null);
    }

    /* renamed from: to */
    public static final AutoClassificationConfig m3220to(NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig, long j) {
        CapturePageConfig capturePageConfig;
        AutoClassificationConfig.Companion companion = AutoClassificationConfig.INSTANCE;
        IdConfig.IdSideConfig idSideConfigM3217to = null;
        Boolean boolIsEnabled = autoClassificationConfig != null ? autoClassificationConfig.isEnabled() : null;
        Boolean extractTextFromImage = autoClassificationConfig != null ? autoClassificationConfig.getExtractTextFromImage() : null;
        if (autoClassificationConfig != null && (capturePageConfig = autoClassificationConfig.getCapturePageConfig()) != null) {
            idSideConfigM3217to = m3217to(capturePageConfig, IdConfig.Side.Front, IdClass.Unknown, "", j);
        }
        return companion.newInstance(boolIsEnabled, extractTextFromImage, idSideConfigM3217to);
    }
}
