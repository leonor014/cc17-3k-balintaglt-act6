package com.example.a30daysapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FitnessTipAdapter
    private val tips = listOf(
        FitnessTip("Drink Water Every Morning", "Day 1","Start your day with hydration!", R.drawable.water),
        FitnessTip("30-Minute Daily Walk", "Day 2", "Walking is a great way to stay fit.", R.drawable.walking),
        FitnessTip("Push-Ups", "Day 3", "Start in a plank position with hands under shoulders. Lower your body until your chest nearly touches the floor, keeping elbows close to your body. Push back up to the starting position.", R.drawable.push_up),
        FitnessTip("Bodyweight Squats", "Day 4", "Stand with feet shoulder-width apart. Lower your hips back and down as if sitting in a chair, keeping your chest up and knees behind toes. Rise back to standing.", R.drawable.bodyweight_squat),
        FitnessTip("Plank Hold", "Day 5","Lie face down, then lift your body off the ground with forearms and toes, keeping a straight line from head to heels. Hold this position while engaging your core.", R.drawable.plank),
        FitnessTip("Lunges", "Day 6","Stand tall, step forward with one leg, and lower your hips until both knees are bent at a 90-degree angle. Push back to the starting position and switch legs.", R.drawable.lunges),
        FitnessTip("Bicycle Crunches", "Day 7","Lie on your back, lift your legs to a tabletop position. Bring one elbow towards the opposite knee while straightening the other leg. Alternate sides in a pedaling motion.", R.drawable.bicycle_crunches),
        FitnessTip("Burpees", "Day 8","Start standing, drop into a squat, place your hands on the ground, and jump your feet back into a plank. Perform a push-up, jump feet back to hands, and jump up explosively.", R.drawable.burpees),
        FitnessTip("Mountain Climbers", "Day 9","Begin in a plank position. Drive one knee toward your chest, then quickly switch legs, as if running in place while maintaining the plank position.", R.drawable.mt_climber),
        FitnessTip("Glute Bridges", "Day 10","Lie on your back with knees bent and feet flat on the floor. Lift your hips towards the ceiling by squeezing your glutes, then lower back down.", R.drawable.glute_bridges),
        FitnessTip("Tricep Dips", "Day 11","Sit on the edge of a bench or chair, hands next to your thighs. Slide off the edge, lower your body by bending elbows to 90 degrees, then push back up.", R.drawable.tricep_dips),
        FitnessTip("High Knees", "Day 12","Stand tall and run in place, bringing your knees up towards your chest as high as possible while pumping your arms.", R.drawable.high_knees),
        FitnessTip("Side Plank", "Day 13","Lie on your side and prop yourself up on one elbow, keeping your body in a straight line. Hold the position, engaging your core.", R.drawable.side_plank),
        FitnessTip("Wall Sit", "Day 14","Lean against a wall and slide down until your knees are at a 90-degree angle. Hold this position, keeping your back against the wall.", R.drawable.wall_sit),
        FitnessTip("Skaters", "Day 15","Jump to one side, landing on one foot, then immediately jump to the other side. Alternate side-to-side, mimicking a skating motion.", R.drawable.skaters),
        FitnessTip("Russian Twists", "Day 16","Sit on the ground with knees bent. Lean back slightly and twist your torso to one side, then the other, while holding a weight or clasping your hands.", R.drawable.russian_twist),
        FitnessTip("Step-Ups", "Day 17","Stand in front of a sturdy bench or step. Step up with one foot, then bring the other foot up. Step back down and repeat, alternating legs.", R.drawable.step_ups),
        FitnessTip("Dead Bugs", "Day 18","Lie on your back with arms extended toward the ceiling and knees bent at 90 degrees. Lower opposite arm and leg towards the floor, then return to start and switch sides.", R.drawable.dead_bugs),
        FitnessTip("Jump Rope", "Day 19","Grab a jump rope and jump continuously while swinging the rope under your feet. Maintain a light bounce and keep your elbows close to your sides.", R.drawable.jump_rope),
        FitnessTip("Flutter Kicks", "Day 20","Lie on your back, lift your legs off the ground a few inches, and alternate kicking them up and down in a controlled manner while engaging your core.", R.drawable.flutter_kicks),
        FitnessTip("Reverse Crunches", "Day 21","Lie on your back with knees bent. Lift your hips off the floor towards your chest, then lower back down while keeping your legs bent.", R.drawable.reverse_crunches),
        FitnessTip("Chest Press", "Day 22","Lie on your back on a bench, holding dumbbells at your chest. Press the weights up until your arms are fully extended, then lower them back down.", R.drawable.chest_press),
        FitnessTip("Shoulder Press", "Day 23","Stand or sit with dumbbells at shoulder height. Press the weights overhead until your arms are straight, then lower back to the starting position.", R.drawable.shoulder_press),
        FitnessTip("Sumo Squats", "Day 24","Stand with feet wider than shoulder-width and toes pointed out. Lower your hips back and down, keeping your chest up, then rise back up.", R.drawable.sumo_squat),
        FitnessTip("T-Push_Ups", "Day 25","Perform a push-up, and as you come up, rotate your body to one side, extending your arm up into a T position. Alternate sides.", R.drawable.t_push_ups),
        FitnessTip("Yoga Flow", "Day 26","Follow a series of yoga poses (like Downward Dog, Cobra, etc.) to enhance flexibility and relaxation. Spend 20 minutes flowing through various positions.", R.drawable.yoga),
        FitnessTip("Core Circuit", "Day 27","Combine exercises like planks, bicycle crunches, and leg raises, performing each for 30 seconds with minimal rest in between. Repeat for three rounds.", R.drawable.core_circuit),
        FitnessTip("Agility Drills", "Day 28","Set up cones or markers and perform various drills, such as lateral shuffles, forward/backward sprints, and quick feet drills.", R.drawable.agility_drills),
        FitnessTip("Stretching Routine", "Day 29","Spend 15-20 minutes stretching major muscle groups, focusing on hamstrings, quadriceps, shoulders, and back to improve flexibility.", R.drawable.stretching),
        FitnessTip("Interval Running", "Day 30","Alternate between walking and running for 20-30 minutes. For example, run for 1 minute, then walk for 2 minutes.", R.drawable.interval_running),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = FitnessTipAdapter(tips)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}

data class FitnessTip(
    val title: String,
    val day: String,
    val description: String,
    val imageResId: Int
)

