package com.robinhood.android.futures.eventbrackets.p141ui;

import com.robinhood.android.futures.eventbrackets.p141ui.BracketMatchState;
import com.singular.sdk.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SampleBracketData.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003\"\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003\"\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0003\"\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0003\"\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0003\"\u0011\u0010\u001c\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0003\"\u0011\u0010\u001e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0003\"\u0011\u0010 \u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0003\"\u0011\u0010\"\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0003\"\u0011\u0010$\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0003\"\u0011\u0010&\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0003\"\u0011\u0010(\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0003\"\u0011\u0010*\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0003\"\u0011\u0010,\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0003\"\u0011\u0010.\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0003\"\u0011\u00100\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0003\"\u0011\u00102\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0003\"\u0011\u00104\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0003\"\u0011\u00106\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0003\"\u0011\u00108\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0003\"\u0011\u0010:\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0003\"\u0011\u0010<\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0003\"\u0011\u0010>\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0003\"\u0011\u0010@\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0003\"\u0011\u0010B\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E\"\u0011\u0010F\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bG\u0010E\"\u0011\u0010H\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bI\u0010E\"\u0011\u0010J\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bK\u0010E\"\u0011\u0010L\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bM\u0010E\"\u0011\u0010N\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bO\u0010E\"\u0011\u0010P\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010E\"\u0011\u0010R\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bS\u0010E\"\u0011\u0010T\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bU\u0010E\"\u0011\u0010V\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bW\u0010E\"\u0011\u0010X\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bY\u0010E\"\u0011\u0010Z\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\b[\u0010E\"\u0011\u0010\\\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\b]\u0010E\"\u0011\u0010^\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\b_\u0010E\"\u0011\u0010`\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\ba\u0010E\"\u0011\u0010b\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bc\u0010E\"\u0011\u0010d\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\be\u0010E\"\u0011\u0010f\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bh\u0010i\"\u0011\u0010j\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bk\u0010i\"\u0011\u0010l\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bm\u0010i\"\u0011\u0010n\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bo\u0010i\"\u0011\u0010p\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bq\u0010i\"\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020g0s¢\u0006\b\n\u0000\u001a\u0004\bt\u0010u\"\u0011\u0010v\u001a\u00020w¢\u0006\b\n\u0000\u001a\u0004\bx\u0010y¨\u0006z"}, m3636d2 = {"seed1", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "getSeed1", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameSeedData;", "seed2", "getSeed2", "seed4", "getSeed4", "seed3", "getSeed3", "seed5", "getSeed5", "seed6", "getSeed6", "seed7", "getSeed7", "seed8", "getSeed8", "seed9", "getSeed9", "seed10", "getSeed10", "seed11", "getSeed11", "seed12", "getSeed12", "seed13", "getSeed13", "seed14", "getSeed14", "seed15", "getSeed15", "seed16", "getSeed16", "seed17", "getSeed17", "seed18", "getSeed18", "seed19", "getSeed19", "seed20", "getSeed20", "seed21", "getSeed21", "seed22", "getSeed22", "seed23", "getSeed23", "seed24", "getSeed24", "seed25", "getSeed25", "seed26", "getSeed26", "seed27", "getSeed27", "seed28", "getSeed28", "seed29", "getSeed29", "seed30", "getSeed30", "seed31", "getSeed31", "seed32", "getSeed32", "card1", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "getCard1", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketGameOverviewCardData;", "card2", "getCard2", "card3", "getCard3", "card4", "getCard4", "card5", "getCard5", "card6", "getCard6", "card7", "getCard7", "card8", "getCard8", "card9", "getCard9", "card10", "getCard10", "card11", "getCard11", "card12", "getCard12", "card13", "getCard13", "card14", "getCard14", "card15", "getCard15", "card16", "getCard16", "card17", "getCard17", "round1", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "getRound1", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketRoundData;", "round2", "getRound2", "round3", "getRound3", "round4", "getRound4", "round5", "getRound5", "allRounds", "Lkotlinx/collections/immutable/PersistentList;", "getAllRounds", "()Lkotlinx/collections/immutable/PersistentList;", "bracketNavigationInfo", "Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "getBracketNavigationInfo", "()Lcom/robinhood/android/futures/eventbrackets/ui/BracketNavigationInfo;", "feature-event-brackets_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.eventbrackets.ui.SampleBracketDataKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class SampleBracketData {
    private static final ImmutableList3<BracketRoundData> allRounds;
    private static final BracketNavigationInfo bracketNavigationInfo;
    private static final BracketGameOverviewCardData card1;
    private static final BracketGameOverviewCardData card10;
    private static final BracketGameOverviewCardData card11;
    private static final BracketGameOverviewCardData card12;
    private static final BracketGameOverviewCardData card13;
    private static final BracketGameOverviewCardData card14;
    private static final BracketGameOverviewCardData card15;
    private static final BracketGameOverviewCardData card16;
    private static final BracketGameOverviewCardData card17;
    private static final BracketGameOverviewCardData card2;
    private static final BracketGameOverviewCardData card3;
    private static final BracketGameOverviewCardData card4;
    private static final BracketGameOverviewCardData card5;
    private static final BracketGameOverviewCardData card6;
    private static final BracketGameOverviewCardData card7;
    private static final BracketGameOverviewCardData card8;
    private static final BracketGameOverviewCardData card9;
    private static final BracketRoundData round1;
    private static final BracketRoundData round2;
    private static final BracketRoundData round3;
    private static final BracketRoundData round4;
    private static final BracketRoundData round5;
    private static final BracketGameSeedData seed1;
    private static final BracketGameSeedData seed10;
    private static final BracketGameSeedData seed11;
    private static final BracketGameSeedData seed12;
    private static final BracketGameSeedData seed13;
    private static final BracketGameSeedData seed14;
    private static final BracketGameSeedData seed15;
    private static final BracketGameSeedData seed16;
    private static final BracketGameSeedData seed17;
    private static final BracketGameSeedData seed18;
    private static final BracketGameSeedData seed19;
    private static final BracketGameSeedData seed2;
    private static final BracketGameSeedData seed20;
    private static final BracketGameSeedData seed21;
    private static final BracketGameSeedData seed22;
    private static final BracketGameSeedData seed23;
    private static final BracketGameSeedData seed24;
    private static final BracketGameSeedData seed25;
    private static final BracketGameSeedData seed26;
    private static final BracketGameSeedData seed27;
    private static final BracketGameSeedData seed28;
    private static final BracketGameSeedData seed29;
    private static final BracketGameSeedData seed3;
    private static final BracketGameSeedData seed30;
    private static final BracketGameSeedData seed31;
    private static final BracketGameSeedData seed32;
    private static final BracketGameSeedData seed4;
    private static final BracketGameSeedData seed5;
    private static final BracketGameSeedData seed6;
    private static final BracketGameSeedData seed7;
    private static final BracketGameSeedData seed8;
    private static final BracketGameSeedData seed9;

    static {
        BracketGameSeedData bracketGameSeedData = new BracketGameSeedData(Constants.SdidMigrationStatusCodes.ALREADY_SDID, "San Diego St", "7%", "#00c805", "#00c805", null, 32, null);
        seed1 = bracketGameSeedData;
        BracketGameSeedData bracketGameSeedData2 = new BracketGameSeedData("12", "UAB", "93%", "#ff2b00", "#ff2b00", null, 32, null);
        seed2 = bracketGameSeedData2;
        BracketGameSeedData bracketGameSeedData3 = new BracketGameSeedData(Constants.SdidMigrationStatusCodes.MISSING_PARAMS, "Auburn", "84%", "#ffaa05", "#ffaa05", null, 32, null);
        seed4 = bracketGameSeedData3;
        BracketGameSeedData bracketGameSeedData4 = new BracketGameSeedData("13", "Yale", "16%", "#7ff51a", "#7ff51a", null, 32, null);
        seed3 = bracketGameSeedData4;
        BracketGameSeedData bracketGameSeedData5 = new BracketGameSeedData(Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION, "BYU", "99%", "#ffaa05", "#ffaa05", null, 32, null);
        seed5 = bracketGameSeedData5;
        BracketGameSeedData bracketGameSeedData6 = new BracketGameSeedData("16", "Duquesne", "99%", "#ffaa05", "#ffaa05", null, 32, null);
        seed6 = bracketGameSeedData6;
        BracketGameSeedData bracketGameSeedData7 = new BracketGameSeedData("17", "Houston", "11%", "#ffaa05", "#ffaa05", null, 32, null);
        seed7 = bracketGameSeedData7;
        BracketGameSeedData bracketGameSeedData8 = new BracketGameSeedData("28", "Texas", "89%", "#ffaa05", "#ffaa05", null, 32, null);
        seed8 = bracketGameSeedData8;
        BracketGameSeedData bracketGameSeedData9 = new BracketGameSeedData("9", "Florida", "45%", "#00ff00", "#00ff00", null, 32, null);
        seed9 = bracketGameSeedData9;
        BracketGameSeedData bracketGameSeedData10 = new BracketGameSeedData("10", "Wisconsin", "55%", "#ff0000", "#ff0000", null, 32, null);
        seed10 = bracketGameSeedData10;
        BracketGameSeedData bracketGameSeedData11 = new BracketGameSeedData("11", "Michigan", "60%", "#0000ff", "#0000ff", null, 32, null);
        seed11 = bracketGameSeedData11;
        BracketGameSeedData bracketGameSeedData12 = new BracketGameSeedData("18", "Oregon", "40%", "#ffff00", "#ffff00", null, 32, null);
        seed12 = bracketGameSeedData12;
        BracketGameSeedData bracketGameSeedData13 = new BracketGameSeedData("19", "UCLA", "70%", "#00ffff", "#00ffff", null, 32, null);
        seed13 = bracketGameSeedData13;
        BracketGameSeedData bracketGameSeedData14 = new BracketGameSeedData("20", "USC", "30%", "#ff00ff", "#ff00ff", null, 32, null);
        seed14 = bracketGameSeedData14;
        BracketGameSeedData bracketGameSeedData15 = new BracketGameSeedData("21", "Stanford", "80%", "#800080", "#800080", null, 32, null);
        seed15 = bracketGameSeedData15;
        BracketGameSeedData bracketGameSeedData16 = new BracketGameSeedData("22", "Cal", "20%", "#808080", "#808080", null, 32, null);
        seed16 = bracketGameSeedData16;
        BracketGameSeedData bracketGameSeedData17 = new BracketGameSeedData("23", "Arizona", "50%", "#123456", "#123456", null, 32, null);
        seed17 = bracketGameSeedData17;
        BracketGameSeedData bracketGameSeedData18 = new BracketGameSeedData("24", "Nevada", "50%", "#654321", "#654321", null, 32, null);
        seed18 = bracketGameSeedData18;
        BracketGameSeedData bracketGameSeedData19 = new BracketGameSeedData("25", "Utah", "50%", "#abcdef", "#abcdef", null, 32, null);
        seed19 = bracketGameSeedData19;
        BracketGameSeedData bracketGameSeedData20 = new BracketGameSeedData("26", "Colorado", "50%", "#fedcba", "#fedcba", null, 32, null);
        seed20 = bracketGameSeedData20;
        BracketGameSeedData bracketGameSeedData21 = new BracketGameSeedData("27", "Washington", "50%", "#112233", "#112233", null, 32, null);
        seed21 = bracketGameSeedData21;
        BracketGameSeedData bracketGameSeedData22 = new BracketGameSeedData("28", "Oregon State", "50%", "#332211", "#332211", null, 32, null);
        seed22 = bracketGameSeedData22;
        seed23 = new BracketGameSeedData("29", "Arizona State", "50%", "#445566", "#445566", null, 32, null);
        seed24 = new BracketGameSeedData("30", "Boise State", "50%", "FF665544", "FF665544", null, 32, null);
        BracketGameSeedData bracketGameSeedData23 = new BracketGameSeedData("31", "UNLV", "50%", "#665544", "#665544", null, 32, null);
        seed25 = bracketGameSeedData23;
        BracketGameSeedData bracketGameSeedData24 = new BracketGameSeedData("32", "New Mexico", "50%", "#998877", "#998877", null, 32, null);
        seed26 = bracketGameSeedData24;
        BracketGameSeedData bracketGameSeedData25 = new BracketGameSeedData("33", "Wyoming", "50%", "#aabbcc", "#aabbcc", null, 32, null);
        seed27 = bracketGameSeedData25;
        BracketGameSeedData bracketGameSeedData26 = new BracketGameSeedData("34", "Montana", "50%", "#ccbbaa", "#ccbbaa", null, 32, null);
        seed28 = bracketGameSeedData26;
        BracketGameSeedData bracketGameSeedData27 = new BracketGameSeedData("35", "Idaho", "50%", "#ddeeff", "#ddeeff", null, 32, null);
        seed29 = bracketGameSeedData27;
        BracketGameSeedData bracketGameSeedData28 = new BracketGameSeedData("36", "North Dakota", "50%", "#eeddcc", "#eeddcc", null, 32, null);
        seed30 = bracketGameSeedData28;
        BracketGameSeedData bracketGameSeedData29 = new BracketGameSeedData("37", "South Dakota", "50%", "#112244", "#112244", null, 32, null);
        seed31 = bracketGameSeedData29;
        BracketGameSeedData bracketGameSeedData30 = new BracketGameSeedData("38", "Nebraska", "50%", "#442211", "#442211", null, 32, null);
        seed32 = bracketGameSeedData30;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData = new BracketGameOverviewCardData(uuidRandomUUID, bracketGameSeedData, bracketGameSeedData2, "LIVE", new BracketMatchState.Tradeable(true), true, null, false, 192, null);
        card1 = bracketGameOverviewCardData;
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData2 = new BracketGameOverviewCardData(uuidRandomUUID2, bracketGameSeedData4, bracketGameSeedData3, "Mar 21, 2025", new BracketMatchState.Tradeable(true), false, null, false, 192, null);
        card2 = bracketGameOverviewCardData2;
        UUID uuidRandomUUID3 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData3 = new BracketGameOverviewCardData(uuidRandomUUID3, bracketGameSeedData5, bracketGameSeedData6, "Final score", new BracketMatchState.Resolved(true), true, null, false, 192, null);
        card3 = bracketGameOverviewCardData3;
        UUID uuidRandomUUID4 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID4, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData4 = new BracketGameOverviewCardData(uuidRandomUUID4, bracketGameSeedData7, bracketGameSeedData8, "Mar 11, 2025", new BracketMatchState.Tradeable(true), false, null, false, 192, null);
        card4 = bracketGameOverviewCardData4;
        UUID uuidRandomUUID5 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID5, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData5 = new BracketGameOverviewCardData(uuidRandomUUID5, bracketGameSeedData9, bracketGameSeedData10, "Mar 12, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card5 = bracketGameOverviewCardData5;
        UUID uuidRandomUUID6 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID6, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData6 = new BracketGameOverviewCardData(uuidRandomUUID6, bracketGameSeedData11, bracketGameSeedData12, "Mar 13, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card6 = bracketGameOverviewCardData6;
        UUID uuidRandomUUID7 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID7, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData7 = new BracketGameOverviewCardData(uuidRandomUUID7, bracketGameSeedData13, bracketGameSeedData14, "Mar 14, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card7 = bracketGameOverviewCardData7;
        UUID uuidRandomUUID8 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID8, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData8 = new BracketGameOverviewCardData(uuidRandomUUID8, bracketGameSeedData15, bracketGameSeedData16, "Mar 15, 2025", new BracketMatchState.Tradeable(true), false, null, false, 192, null);
        card8 = bracketGameOverviewCardData8;
        UUID uuidRandomUUID9 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID9, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData9 = new BracketGameOverviewCardData(uuidRandomUUID9, bracketGameSeedData17, bracketGameSeedData18, "Mar 16, 2025", new BracketMatchState.Tradeable(true), false, null, false, 192, null);
        card9 = bracketGameOverviewCardData9;
        UUID uuidRandomUUID10 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID10, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData10 = new BracketGameOverviewCardData(uuidRandomUUID10, bracketGameSeedData19, bracketGameSeedData20, "Mar 17, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card10 = bracketGameOverviewCardData10;
        UUID uuidRandomUUID11 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID11, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData11 = new BracketGameOverviewCardData(uuidRandomUUID11, bracketGameSeedData21, bracketGameSeedData22, "Mar 18, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card11 = bracketGameOverviewCardData11;
        UUID uuidRandomUUID12 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID12, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData12 = new BracketGameOverviewCardData(uuidRandomUUID12, null, null, "Mar 19, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card12 = bracketGameOverviewCardData12;
        UUID uuidRandomUUID13 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID13, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData13 = new BracketGameOverviewCardData(uuidRandomUUID13, bracketGameSeedData23, bracketGameSeedData24, "Mar 20, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card13 = bracketGameOverviewCardData13;
        UUID uuidRandomUUID14 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID14, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData14 = new BracketGameOverviewCardData(uuidRandomUUID14, bracketGameSeedData25, bracketGameSeedData26, "Mar 21, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card14 = bracketGameOverviewCardData14;
        UUID uuidRandomUUID15 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID15, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData15 = new BracketGameOverviewCardData(uuidRandomUUID15, bracketGameSeedData27, bracketGameSeedData28, "Mar 22, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card15 = bracketGameOverviewCardData15;
        UUID uuidRandomUUID16 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID16, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData16 = new BracketGameOverviewCardData(uuidRandomUUID16, bracketGameSeedData29, bracketGameSeedData30, "Mar 23, 2025", new BracketMatchState.Locked(false), false, null, false, 192, null);
        card16 = bracketGameOverviewCardData16;
        UUID uuidRandomUUID17 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID17, "randomUUID(...)");
        BracketGameOverviewCardData bracketGameOverviewCardData17 = new BracketGameOverviewCardData(uuidRandomUUID17, bracketGameSeedData27, bracketGameSeedData30, "Mar 28, 2025", new BracketMatchState.Tradeable(true), false, null, false, 192, null);
        card17 = bracketGameOverviewCardData17;
        BracketRoundData bracketRoundData = new BracketRoundData(extensions2.persistentListOf(bracketGameOverviewCardData, bracketGameOverviewCardData2, bracketGameOverviewCardData3, bracketGameOverviewCardData4, bracketGameOverviewCardData5, bracketGameOverviewCardData6, bracketGameOverviewCardData7, bracketGameOverviewCardData8, bracketGameOverviewCardData9, bracketGameOverviewCardData10, bracketGameOverviewCardData11, bracketGameOverviewCardData12, bracketGameOverviewCardData13, bracketGameOverviewCardData14, bracketGameOverviewCardData15, bracketGameOverviewCardData16));
        round1 = bracketRoundData;
        BracketRoundData bracketRoundData2 = new BracketRoundData(extensions2.persistentListOf(bracketGameOverviewCardData9, bracketGameOverviewCardData10, bracketGameOverviewCardData11, bracketGameOverviewCardData12, bracketGameOverviewCardData13, bracketGameOverviewCardData14, bracketGameOverviewCardData15, bracketGameOverviewCardData16));
        round2 = bracketRoundData2;
        BracketRoundData bracketRoundData3 = new BracketRoundData(extensions2.persistentListOf(bracketGameOverviewCardData13, bracketGameOverviewCardData14, bracketGameOverviewCardData15, bracketGameOverviewCardData16));
        round3 = bracketRoundData3;
        BracketRoundData bracketRoundData4 = new BracketRoundData(extensions2.persistentListOf(bracketGameOverviewCardData15, bracketGameOverviewCardData16));
        round4 = bracketRoundData4;
        BracketRoundData bracketRoundData5 = new BracketRoundData(extensions2.persistentListOf(bracketGameOverviewCardData17));
        round5 = bracketRoundData5;
        allRounds = extensions2.persistentListOf(bracketRoundData, bracketRoundData2, bracketRoundData3, bracketRoundData4, bracketRoundData5);
        bracketNavigationInfo = new BracketNavigationInfo(extensions2.persistentListOf(new NavigationRound("Rnd of 32", true), new NavigationRound("Rnd of 16", true), new NavigationRound("Rnd of 8", true), new NavigationRound("Rnd of 4", false), new NavigationRound("Final", false)), extensions2.persistentListOf("East", "South", "West", "North"));
    }

    public static final BracketGameSeedData getSeed1() {
        return seed1;
    }

    public static final BracketGameSeedData getSeed2() {
        return seed2;
    }

    public static final BracketGameSeedData getSeed4() {
        return seed4;
    }

    public static final BracketGameSeedData getSeed3() {
        return seed3;
    }

    public static final BracketGameSeedData getSeed5() {
        return seed5;
    }

    public static final BracketGameSeedData getSeed6() {
        return seed6;
    }

    public static final BracketGameSeedData getSeed7() {
        return seed7;
    }

    public static final BracketGameSeedData getSeed8() {
        return seed8;
    }

    public static final BracketGameSeedData getSeed9() {
        return seed9;
    }

    public static final BracketGameSeedData getSeed10() {
        return seed10;
    }

    public static final BracketGameSeedData getSeed11() {
        return seed11;
    }

    public static final BracketGameSeedData getSeed12() {
        return seed12;
    }

    public static final BracketGameSeedData getSeed13() {
        return seed13;
    }

    public static final BracketGameSeedData getSeed14() {
        return seed14;
    }

    public static final BracketGameSeedData getSeed15() {
        return seed15;
    }

    public static final BracketGameSeedData getSeed16() {
        return seed16;
    }

    public static final BracketGameSeedData getSeed17() {
        return seed17;
    }

    public static final BracketGameSeedData getSeed18() {
        return seed18;
    }

    public static final BracketGameSeedData getSeed19() {
        return seed19;
    }

    public static final BracketGameSeedData getSeed20() {
        return seed20;
    }

    public static final BracketGameSeedData getSeed21() {
        return seed21;
    }

    public static final BracketGameSeedData getSeed22() {
        return seed22;
    }

    public static final BracketGameSeedData getSeed23() {
        return seed23;
    }

    public static final BracketGameSeedData getSeed24() {
        return seed24;
    }

    public static final BracketGameSeedData getSeed25() {
        return seed25;
    }

    public static final BracketGameSeedData getSeed26() {
        return seed26;
    }

    public static final BracketGameSeedData getSeed27() {
        return seed27;
    }

    public static final BracketGameSeedData getSeed28() {
        return seed28;
    }

    public static final BracketGameSeedData getSeed29() {
        return seed29;
    }

    public static final BracketGameSeedData getSeed30() {
        return seed30;
    }

    public static final BracketGameSeedData getSeed31() {
        return seed31;
    }

    public static final BracketGameSeedData getSeed32() {
        return seed32;
    }

    public static final BracketGameOverviewCardData getCard1() {
        return card1;
    }

    public static final BracketGameOverviewCardData getCard2() {
        return card2;
    }

    public static final BracketGameOverviewCardData getCard3() {
        return card3;
    }

    public static final BracketGameOverviewCardData getCard4() {
        return card4;
    }

    public static final BracketGameOverviewCardData getCard5() {
        return card5;
    }

    public static final BracketGameOverviewCardData getCard6() {
        return card6;
    }

    public static final BracketGameOverviewCardData getCard7() {
        return card7;
    }

    public static final BracketGameOverviewCardData getCard8() {
        return card8;
    }

    public static final BracketGameOverviewCardData getCard9() {
        return card9;
    }

    public static final BracketGameOverviewCardData getCard10() {
        return card10;
    }

    public static final BracketGameOverviewCardData getCard11() {
        return card11;
    }

    public static final BracketGameOverviewCardData getCard12() {
        return card12;
    }

    public static final BracketGameOverviewCardData getCard13() {
        return card13;
    }

    public static final BracketGameOverviewCardData getCard14() {
        return card14;
    }

    public static final BracketGameOverviewCardData getCard15() {
        return card15;
    }

    public static final BracketGameOverviewCardData getCard16() {
        return card16;
    }

    public static final BracketGameOverviewCardData getCard17() {
        return card17;
    }

    public static final BracketRoundData getRound1() {
        return round1;
    }

    public static final BracketRoundData getRound2() {
        return round2;
    }

    public static final BracketRoundData getRound3() {
        return round3;
    }

    public static final BracketRoundData getRound4() {
        return round4;
    }

    public static final BracketRoundData getRound5() {
        return round5;
    }

    public static final ImmutableList3<BracketRoundData> getAllRounds() {
        return allRounds;
    }

    public static final BracketNavigationInfo getBracketNavigationInfo() {
        return bracketNavigationInfo;
    }
}
